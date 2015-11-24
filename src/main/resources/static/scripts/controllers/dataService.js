'use strict';

angular.module('mswFrontendApp')
    .factory('dataService', ['$rootScope','$http',function ($rootScope,$http) {


        var dataService = {
            userData: undefined
        };


        dataService.initialize = function () {
            this.userData = undefined;

            $rootScope.$on('new-data', function(data) {
                self.setData(data);
            });
        }

        dataService.setData = function (data) {
            self.userData = data;
            $rootScope.$broadcast('data-updated');
        };


        dataService.getData = function () {
            return self.userData;
        };

        dataService.reload= function () {
            return $http.get('/users/getcurrentuser').success(function (data) {
                dataService.setData(data);
            }).error(function () {
                dataService.setData(undefined);
            });
        };

        dataService.initialize();

        return dataService;
    }])



;
