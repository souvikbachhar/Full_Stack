var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	console.log("scope invoked");
	$scope.check = function(num) {
		console.log("inside controller");
		console.log($scope.num);
		$http.get('/check?num='+num).then(function(output) {
			console.log(output);
			$scope.result=output.data;
		}, function(error) {
			console.log("fail");
		});
	}
});
