<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular.min.js"></script>
<script>
var app = angular.module("myApp", []);



app.controller('myCtrl', function($scope, $http) {
	$scope.insertData = function(emp) {
		$http.post('/insertData?id='+emp.id+'&name='+emp.name+'&salary='+emp.salary).then(function(success) {
			console.log(success);
			$scope.emp.result="";
		}, function(error) {
			console.log("fail");
		});
	}
});

</script>
<title>Home</title>
</head>
<body>
MY JSP

<div ng-app="myApp" ng-controller="myCtrl">
		<p>
			Employee ID :<input type="text" ng-model="emp.id" >
		</p>
		<p>
			Employee Name :<input type="text" ng-model="emp.name">
		</p>
		<p>
			Employee Salary:<input type="text" ng-model="emp.salary">
		</p> 
		<p>
			<span ng-bind="emp.result"></span>
		</p> 
		<p>
			<button ng-click="insertData(emp)">Submit</button>
		</p>
	</div>
</body>
</html>