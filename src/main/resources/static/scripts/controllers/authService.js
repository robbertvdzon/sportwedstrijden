'use strict';

angular.module('mswFrontendApp')
    .factory('authService', ['$http', '$location' , 'dataService', function ($http, $location, dataService) {

        var authService = {
            userData: undefined
        };


        authService.initialize = function () {
            this.userData = undefined;
            var self = this;
        }


        authService.isAuthenticated = function () {
            return !angular.isUndefined(self.userData);
        };


        authService.logOff = function () {
            this.userData = undefined;
            $http.get('/logout').success(function (data) {
                $location.path('/')
            }
            )
        };

        authService.checkLogin = function () {
            return $http.get('/users/getcurrentuser').success(function (data) {
                dataService.setData(data);
                self.userData = data;
            }).error(function () {
                self.userData = undefined;
                dataService.setData(undefined);
            });
        };

        authService.initialize();

        return authService;
    }])



;
