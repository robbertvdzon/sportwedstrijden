'use strict';

angular.module('mswFrontendApp')

    .controller('TeamsCtrl', ['$scope', '$rootScope', '$http', 'dataService', '$location', function ($scope, $rootScope, $http, dataService, $location) {

        $scope.teams = [];
        $scope.selectedteam = {};
        $scope.newteam = {};
        $scope.showEdit = false;
        $scope.showNew = false;
        $scope.showList = false;

        $scope.initialize = function () {
            $rootScope.$on('data-updated', function() {
                $scope.loadData();
            });
            $scope.loadData();
            $scope.showPartial('showList');
        }

        $scope.showPartial = function (partial) {
            $scope['showEdit'] = false;
            $scope['showNew'] = false;
            $scope['showList'] = false;
            $scope[partial] = true;
        }



        $scope.loadData = function () {
            if (dataService.getData() != undefined){
                $scope.teams = dataService.getData().teams;
            }
        }

       $scope.edit = function (uuid) {
            for (var i = 0; i < $scope.teams.length; i++) {
                  var team = $scope.teams[i];
                  if (team.uuid===uuid) {
                       $scope.selectedteam = {};
                       $scope.selectedteam.uuid = team.uuid;
                       $scope.selectedteam.teamname = team.teamname;
                  }
            }
            $scope.showPartial('showEdit');
        }

       $scope.save = function () {
            $http({
                url: "/rest/teams/",
                method: "POST",
                params: $scope.selectedteam
             }).success(
                   function (response) {
                       dataService.reload();
               });
            $scope.showPartial('showList');
        }

       $scope.delete = function () {
            $http({
                url: "/rest/teams/"+$scope.selectedteam.uuid,
                method: "DELETE"
             }).success(
                   function (response) {
                       dataService.reload();
                        $scope.showPartial('showList');
               });
       }

       $scope.newTeam = function () {
            $scope.showPartial('showNew');
       }


       $scope.add = function () {
            var newTeam = {};
            newTeam.teamname = $scope.newteam.teamname;
            $http({
                url: "/rest/teams/",
                method: "PUT",
                params: newTeam
             }).success(
                   function (response) {
                       dataService.reload();
               });
            $scope.showPartial('showList');
       }

       $scope.cancel = function () {
            $scope.showPartial('showList');
       }

       $scope.initialize();

    }]);
