var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	
	
	$scope.getBalance = function() {
		$http.get('/getBalance').then(function(output) {
			console.log(output);
			$scope.result=output.data;
		}, function(error) {
			console.log("fail");
		});
		
	}
	
	$scope.deposit= function(dep) {
		$http.get('/deposit?dep='+dep).then(function(output) {
			console.log(output);
			$scope.result=output.data;
		}, function(error) {
			console.log("fail");
		});
		
	}
	
	$scope.withdraw= function(w) {
		console.log("HEllO");
		$http.get('/withdraw?w='+w).then(function(output) {
			console.log(output);
			$scope.result=output.data;
		}, function(error) {
			console.log("fail");
		});
		
	}
	
});
