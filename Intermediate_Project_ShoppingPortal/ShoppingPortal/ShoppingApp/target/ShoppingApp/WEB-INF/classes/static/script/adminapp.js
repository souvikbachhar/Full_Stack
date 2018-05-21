var app = angular.module("adminApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "adminhello.html"
    })
    .when("/addnewproduct", {
        templateUrl : "addnewproduct.html"
    })
    .when("/addnewcategory", {
        templateUrl : "addnewcategory.html"
    })
    .when("/modifycategory", {
        templateUrl : "modifycategory.html"
    })
    .when("/modifyproduct", {
        templateUrl : "modifyproduct.html"
    })
    .when("/deletecategory", {
        templateUrl : "deletecategory.html"
    })
    .when("/deleteproduct", {
        templateUrl : "deleteproduct.html"
    })
    .when("/viewbilling", {
        templateUrl : "viewbilling.html",
        
    })
    .when("/viewcustomer", {
        templateUrl : "viewcustomer.html"
    })
    
});
app.controller('myCtrl', function($scope) {
    $scope.firstname = "John";
    $scope.lastname = "Doe";    
});
app.controller('dCtrl', function($scope) {
    $scope.firstname = "J";
    $scope.lastname = "Doe";    
});
app.controller('addnewcatCtrl', function($scope, $http) {
  
	$scope.addnewcat=function(newcategory){
  	$http.get('/addncategory?id='+newcategory.id+'&name='+newcategory.name).then(function(success) {
		
		if(success.data==1)
		{	$scope.newcategory.status='Successfully added new category';
			$scope.newcategory.name='';
			$scope.newcategory.id='';
		}
		else{
			$scope.newcategory.status='Duplicate category exists';
			$scope.newcategory.name='';
			$scope.newcategory.id='';
		}
	}, function(error) {
		console.log("fail");
	});
	}
});

app.controller('modifycategoryCtrl', function($scope, $http) {
		//$scope.modcategory.categorysearchresult=false;
	 
		$scope.categorysearch=function(modifycategory){
			$scope.modcategory.status='';
	  	$http.get('/modifycategorysearch?id='+modifycategory.id).then(function(success) {
	  		
			console.log(success.data.productCategoryName);
			
			if(success.data)
			{	$scope.modcategory.categorysearchresult=true;
			console.log($scope.modcategory.categorysearchresult);
				$scope.modcategory.name=success.data.productCategoryName;
				$scope.modcategory.findstatus='';
			}
			else{
				$scope.modcategory.categorysearchresult=false;
				$scope.modcategory.findstatus='Not Found';
			}
		}, function(error) {
			console.log("fail");
		});
		}
		
		$scope.reset=function(modcategory){
			$scope.modcategory.categorysearchresult=false;
			$scope.modcategory.id='';
		}
		
		$scope.modifycategory=function(modifycategory){
			console.log('Clicked');
		  	$http.get('/updatecategory?id='+modifycategory.id+'&name='+modifycategory.name).then(function(success) {
				console.log(success.data);
				console.log(success);
				if(success.data)
				{	$scope.modcategory.status='Category Name Changed, all related products category changed also';
				}
				else{
					$scope.modcategory.status='Duplicate Category Exists';
				}
			}, function(error) {
				console.log("fail");
			});
			}
		
	});

app.controller('deletecategoryCtrl', function($scope, $http) {
	//$scope.modcategory.categorysearchresult=false;
 
	
	
	
});

