'use strict';

angular.module('mswFrontendApp')

    .controller('GamesCtrl', ['$scope', '$rootScope', '$http', 'dataService', '$location', function ($scope, $rootScope, $http, dataService, $location) {

        $scope.games = [];
        $scope.selectedgame= {};
        $scope.newgame = {};
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
            if (dataService.getData() != undefined && dataService.getData().teams != undefined){
                $scope.games = [];
                for (var i = 0; i < dataService.getData().teams.length; i++) {
                  var team = dataService.getData().teams[i];
                  for (var j = 0; j < team.competitions.length; j++) {
                    var competition = team.competitions[j];
                    $scope.games = $scope.games.concat(competition.games);
                  }
                }
            }
        }

       $scope.edit = function (uuid) {
        }

       $scope.save = function () {
        }

       $scope.delete = function () {
        }

       $scope.newTeam = function () {
       }

       $scope.add = function () {
       }

       $scope.cancel = function () {
       }

       $scope.initialize();

    }]);
