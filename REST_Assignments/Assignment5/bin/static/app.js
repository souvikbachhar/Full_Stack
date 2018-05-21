var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	console.log("scope invoked");
	$scope.add = function(num1,num2) {
		$http.get('/add?num1='+num1+'&num2='+num2).then(function(output) {
			console.log(output);
			$scope.result=output.data;
		}, function(error) {
			console.log("fail");
		});
		
	}
	
	$scope.subtract = function(num1,num2) {
		$http.get('/subtract?num1='+num1+'&num2='+num2).then(function(output) {
			console.log(output);
			$scope.result=output.data;
		}, function(error) {
			console.log("fail");
		});
		
	}
});
