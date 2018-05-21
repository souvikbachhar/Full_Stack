var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	
	
	$scope.convert = function() {
		$http.get('/convert').then(function(output) {
			console.log(output);
			$scope.result=output.data;
		}, function(error) {
			console.log("fail");
		});
		
	}
	
	$scope.convertxml = function() {
		$http.get('/convertxml').then(function(output) {
			console.log(output);
			$scope.result=output.data;
			
			
		}, function(error) {
			console.log("fail");
		});
		
	}
	
	$scope.fetchone = function(id) {
		$http.get('/find?id='+id).then(function(output) {
			console.log(output);
			$scope.result=output.data;		
		}, function(error) {
			console.log("fail");
		});
		
	}
	
});
