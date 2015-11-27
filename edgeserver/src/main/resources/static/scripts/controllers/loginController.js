
'use strict';

angular.module('mswFrontendApp')
    .controller('LoginCtrl', ['$scope', 'authService', '$http','$location', '$mdDialog', function LoginCtrl($scope, authService, $http, $location, $mdDialog) {

  $scope.name = "q";
  $scope.passwd = "q";
  $scope.loginfailed = false;

  $scope.hide = function() {
    $mdDialog.hide();
  };
  $scope.login = function() {
    $http({
        method: 'POST',
        url: '/login',
        data: "username=" + encodeURIComponent($scope.name) + "&password=" + encodeURIComponent($scope.passwd),
        headers: {'Content-Type': 'application/x-www-form-urlencoded'}
    }).success(function (data) {
            authService.checkLogin().success(function(){
            $location.path('teams');
            $scope.loginfailed = false;
            $mdDialog.hide('succes');
        }).error(function (){
            $scope.loginfailed = true;
        });

    }).error(function () {
        $scope.checkLogin();
    });
  };
  }])


;
