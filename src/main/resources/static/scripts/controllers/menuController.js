'use strict';

angular.module('mswFrontendApp')
    .controller('menuCtrl', ['$scope', 'authService', '$http', '$mdSidenav','$mdDialog', function LoginCtrl($scope, authService, $http, $mdSidenav, $mdDialog) {
        $scope.isAuth = function () {
            return authService.isAuthenticated();
        }

        $scope.openLoginPopup = function (ev) {
            $mdDialog.show({
              controller: 'LoginCtrl',
              templateUrl: 'views/popup/logintemplate.html',
              parent: angular.element(document.body),
              targetEvent: ev,
              clickOutsideToClose:true
            })
            .then(function(answer) {
              $scope.status = 'You said the information was "' + answer + '".';
            }, function() {
              $scope.status = 'You cancelled the dialog.';
            });
        }



        $scope.logOff = function () {
            return authService.logOff();
        }

        $scope.toggleMenu = function () {
            $mdSidenav('left').toggle();
        }

    }])

;


