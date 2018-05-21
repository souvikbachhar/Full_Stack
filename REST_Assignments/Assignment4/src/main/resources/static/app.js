var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	console.log("scope invoked");
	$scope.check = function(name) {
		console.log("inside controller");
		console.log($scope.name);
		$http.get('/check?name='+name).then(function(output) {
			console.log(output);
			$scope.result=output.data.res;
		}, function(error) {
			console.log("fail");
		});
	}
});
