var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	console.log("scope invoked");
	$scope.check = function(date1,date2) {
		console.log("inside controller");
		console.log($scope.date1);
		console.log($scope.date2);
		$http.get('/check?date1='+date1+'&date2='+date2).then(function(output) {
			console.log(output);
			$scope.result=output.data.res;
		}, function(error) {
			console.log("fail");
		});
	}
});
