'use strict';

/**
 * @ngdoc overview
 * @name mswFrontendApp
 * @description
 * # mswFrontendApp
 *
 * Main module of the application.
 */
angular
  .module('mswFrontendApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ngMaterial'
  ])
  .config(function ($mdThemingProvider, $mdIconProvider, $routeProvider) {

        $mdIconProvider
                .defaultIconSet("./svg/avatars.svg", 128)
                .icon("menu"       , "./svg/menu.svg"        , 24)
                .icon("share"      , "./svg/share.svg"       , 24)
                .icon("google_plus", "./svg/google_plus.svg" , 512)
                .icon("hangouts"   , "./svg/hangouts.svg"    , 512)
                .icon("twitter"    , "./svg/twitter.svg"     , 512)
                .icon("phone"      , "./svg/phone.svg"       , 512);

                $mdThemingProvider.theme('default')
                    .primaryPalette('teal')
                    .accentPalette('grey');

          $routeProvider
          .when('/', {
            templateUrl: 'views/main.html',
            controller: 'MainCtrl'
          })
          .when('/login', {
            templateUrl: 'views/login.html',
            controller: 'LoginCtrl'
          })
          .when('/teams', {
            templateUrl: 'views/teams/main.html',
            controller: 'TeamsCtrl'
          })
          .when('/competitions', {
            templateUrl: 'views/competition/main.html',
            controller: 'CompetitionCtrl'
          })
          .when('/games', {
            templateUrl: 'views/games/main.html',
            controller: 'GamesCtrl'
          })
          .when('/settings', {
            templateUrl: 'views/settings/main.html',
            controller: 'SettingsCtrl'
          })
          .otherwise({
            redirectTo: '/'
          });
    })
  ;
