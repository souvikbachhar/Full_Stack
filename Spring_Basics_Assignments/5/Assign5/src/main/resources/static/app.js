var app = angular.module("myApp", []);

app.run(function($rootScope, $http) {

});

app.controller('myCtrl', function($scope, $http) {
	console.log("here i am");
	$scope.insertData = function(id) {
		console.log("inside controller");
		console.log($scope.id.first);
		console.log($scope.id.second);
		$http.get('/add?id1='+id.first+'&id2='+id.second).then(function(success) {
			var a=success.data;
			console.log("success");
			$scope.id.result=a;
			//alert("Sum is :"+a);
		}, function(error) {
			console.log("fail");
		});
	}

});
