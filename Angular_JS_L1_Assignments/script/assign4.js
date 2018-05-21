var app = angular.module('myApp', []);
angular.module('myApp', []).controller('CDController', function($scope) {
    
	$scope.getAllDetails=function(){
		$scope.CDs = [
        {CDId:'1',CDTitle:'Game1',CDPrice:'500'},
        {CDId:'2',CDTitle:'Movie1',CDPrice:'800'},
        {CDId:'3',CDTitle:'Biography1',CDPrice:'200'}
    ];
	}
});