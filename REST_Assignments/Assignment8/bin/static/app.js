var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	
	
	$scope.convert = function(title,singer) {
		$http.get('/convert?title='+title+'&singer='+singer).then(function(output) {
			console.log(output);
			$scope.result=output.data;
		}, function(error) {
			console.log("fail");
		});
		
	}
	
	
	
});
