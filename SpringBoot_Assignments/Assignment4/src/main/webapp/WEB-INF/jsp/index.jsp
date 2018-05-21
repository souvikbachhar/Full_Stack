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
			console.log(success.data);
			if(success.data==1)
			{$scope.emp.id="";
			$scope.emp.name="";
			$scope.emp.salary="";
			$scope.emp.result="Employee added";
			}
		}, function(error) {
			console.log("fail");
		});
	}
	
	$scope.showdata = function() {
		console.log("OK");
		$http.get('/displayAll').then(function(success) {
			console.log(success.data);
			$scope.result2=success.data;
		}, function(error) {
			console.log("fail");
		});
	}
	
	$scope.showdatabyid = function(empid) {
		console.log("OK");
		$http.get('/display/'+empid).then(function(success) {
			console.log(success.data);
			$scope.result1=success.data;
		}, function(error) {
			console.log("fail");
		});
	}
});

</script>
<title>Home</title>
</head>
<body>


<div ng-app="myApp" ng-controller="myCtrl">
		<p>
			<h2>Enter new Employee Details</h2>
		</p>
		
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

	<hr>
		<p>
			<h2>Search Employee Details</h2>
		</p>
		
		<p>
			<input type="text" ng-model="empid" > <button ng-click="showdatabyid(empid)">Search Employee</button>
		</p>
		<p>
			<span ng-bind="result1"></span>
		</p>
		<hr> 
		<p>
			<h2>Show All Data</h2>
		</p>
		
		<p>
			<button ng-click="showdata()">Show All Employee</button>
		</p>
		<p>
			<span ng-bind="result2"></span>
		</p> 
			</div>
</body>
</html>