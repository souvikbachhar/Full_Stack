/*var app = angular.module('myApp', ["ngCookies","ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/checkBalance", {
        templateUrl : "checkBalance.html"
    })
});*/
var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
	$routeProvider

    .when("/checkBalance", {
        templateUrl : "checkBalance.html"
    })
    .when("/transferFunds", {
        templateUrl : "transferFunds.html"
    })
    .when("/contactus", {
        templateUrl : "contactus.html"
    })
    .when("/Offers", {
        templateUrl : "offers.html"
    })
    .when("/Profile", {
        templateUrl : "Profile.html"
    })
    .when("/TransactionSummary", {
        templateUrl : "TransactionSummary.html"
    })

});
app.controller('myCtrl', function($scope,$http,$window,$location) {
	
		 $scope.userName=$window.localStorage.getItem("userName");
		 $scope.userBank=$window.localStorage.getItem("userBank");
	 $scope.login=function(x){
		

		  	$http.get('/checkcredentials?id='+x.username+'&pwd='+x.userpassword+'&bank='+x.bank).then(function(success) {
		  		console.log(success.data);
		  		if(success.data==0)
		  			{
		  			$scope.loginstatus='Invalid credentials';
		  			}
		  		else if(success.data==1){
		  			$window.localStorage.setItem("userName",x.username);
		  			$window.localStorage.setItem("userBank",x.bank);
		  			$window.location.href = "Home.html";
		  			
		  		}
		  			
			}, function(error) {
				console.log("fail");
			});
	 	}    
	  // window.localStorage.removeItem("abc");
	 $scope.logout=function(){
		 window.localStorage.clear();
		 $window.location.href = "login.html";
	 }
	 $scope.check=function(){
		 if($window.localStorage.getItem("userName")== undefined){
			 $window.location.href = "login.html";
			 
		 }
	 }
	 
});

app.controller('checkBalance',function($scope,$http,$window,$location){
	$http.get('/checkbalance?username='+$window.localStorage.getItem("userName")).then(function(success) {
  	//	console.log(success.data.userbalance);
  			$scope.userbalance=success.data.userbalance;
  			$scope.currenttime=new Date();
	}, function(error) {
		console.log("fail");
	});
});

app.controller('transferfunds',function($scope,$http,$window,$location){
	$scope.transactionresult=false;
	$http.get('/checkbalance?username='+$window.localStorage.getItem("userName")).then(function(success) {
	  	//	console.log(success.data.userbalance);
	  			$scope.userbalance=success.data.userbalance;
	  			$scope.currenttime=new Date();
		}, function(error) {
			console.log("fail");
		});
	$scope.usersearch=function(u){
		console.log(u.ubank);
		$http.get('/checkuser?username='+u.uname+'&userbank='+u.ubank+'&sender='+$window.localStorage.getItem("userName")).then(function(success) {
		  	//	console.log(success.data.userbalance);
		  			if(success.data==0){
		  				$scope.loginstatus='User not found, kindly check input details';
		  				$scope.u.searchresult=false;
		  			}
		  			else{
		  				$scope.loginstatus='User found';
		  				$scope.u.searchresult=true;
		  			}
			}, function(error) {
				console.log("fail");
			});
	}
	$scope.transfermoney=function(u){
		$scope.transactionresult=true;
		if(u.transferamount>$scope.userbalance){
			$scope.balanceerror='Insufficient funds';
		}
		else{
			$http.get('/transferfunds?recieverrname='+u.uname+'&recieverbank='+u.ubank+'&transferamount='+u.transferamount+'&sender='+$window.localStorage.getItem("userName")).then(function(success) {
			  	console.log(success.data);
			  	if(success.data.TransactionStatus=='Successful'){
			  		$scope.balanceerror='Transaction Successful,funds has been transfered';
			  	}
			  	else{
			  		$scope.balanceerror='Transaction Failed,If balance deducted, it would be refunder in 24 hours';
			  	}
				}, function(error) {
					console.log("fail");
				});
			
			$scope.balanceerror='OK';
		}
	}
});

app.controller('TransactionSummary',function($scope,$http,$window,$location){
	$scope.summary=true;
	$scope.getTransactions=function(u){
		$scope.summary=false;
	console.log(u.startdate.getDate());
	$scope.sdate=u.startdate.getDate()+'-'+u.startdate.toLocaleString("en-us", { month: "short" })+'-'+u.startdate.getFullYear();
	$scope.edate=u.enddate.getDate()+'-'+u.enddate.toLocaleString("en-us", { month: "short" })+'-'+u.enddate.getFullYear();
	
	$http.get('/transactionSummary?username='+$window.localStorage.getItem("userName")+'&sdate='+$scope.sdate+'&edate='+$scope.edate).then(function(success) {
  		console.log(success.data);
  			$scope.transactions=success.data;
	}, function(error) {
		console.log("fail");
	});
	}
	$scope.printDiv = function(divName) {
		  var printContents = document.getElementById("tsummary").innerHTML;
		  var popupWin = window.open('', '_blank', 'width=300,height=300');
		  popupWin.document.open();
		  popupWin.document.write('<html><head><link rel="stylesheet" type="text/css" href="style.css" /></head><body onload="window.print()">' + printContents + '</body></html>');
		  popupWin.document.close();
		} 
});
