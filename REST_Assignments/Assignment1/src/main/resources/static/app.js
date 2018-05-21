var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	console.log("scope invoked");
	$scope.check = function(cardno) {
		console.log("inside controller");
		console.log($scope.cardno);
		$http.get('/check?cardno='+cardno).then(function(output) {
			var a=output.data;
			if(a==0)
			{
				$scope.result="INVALID";
				}
			else{
				$scope.result="VALID";
			}
		}, function(error) {
			console.log("fail");
		});
	}
});
