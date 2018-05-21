var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	$http.get('/getAllData').then(function(output) {
			console.log(output);
			$scope.emp=output.data;
		}, function(error) {
			console.log("fail");
		});
	$scope.myVar = false;
	$scope.deleteemp = function(empId) {
		console.log("triggered");
		$http.delete('/deleteData?id='+empId).then(function(output) {
			console.log(output);
			$scope.emp=output.data;
		}, function(error) {
			console.log("fail");
		});
		
	}
		
	$scope.updateemp = function(empId,empsalary) {
		console.log(empsalary);
		$http.post('/updateData?id='+empId+'&salary='+empsalary).then(function(output) {
			console.log(output);
			$scope.emp=output.data;
		}, function(error) {
			console.log("fail");
		});
	}
	
	$scope.toggle = function() {
        $scope.myVar = !$scope.myVar;
    };
    
    $scope.insertemp = function(empID,empName,empSalary) {
		console.log(empID+""+empName+""+empSalary);
		$scope.myVar = false;
		$http.put('/insertData?id='+empID+'&name='+empName+'&salary='+empSalary).then(function(output) {
			console.log(output);
			$scope.emp=output.data;
		}, function(error) {
			console.log("fail");
		});
	}
});
