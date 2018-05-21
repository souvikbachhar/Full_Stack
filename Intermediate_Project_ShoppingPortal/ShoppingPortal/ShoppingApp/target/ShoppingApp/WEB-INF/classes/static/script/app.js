var app = angular.module("myApp", []);


app.controller('myCtrl', function($scope, $http) {
		$scope.records = [
							{Category:'Mobile',Price:'1000',Name:'Mi A1'},
							{Category:'Refrigerator',Price:'9999',Name:'LG'},
							{Category:'Camera',Price:'10000',Name:'Nicon'},
							{Category:'Laptop',Price:'10000',Name:'Dell'},
							{Category:'Headphone',Price:'10000',Name:'Skullcandy'},
							{Category:'Headphone',Price:'10000',Name:'JBL'},
							

							];
		var count=0;	
							
		$scope.selectedCategory = ['Mobile','Refrigerator','Camera','Laptop','Headphone'];
		$scope.myfClick = function(a,b){
			if(count==0)
			{
				$scope.selectedCategory = [];
				count=1;
			}
			if(!b){
					
					var index = $scope.selectedCategory.indexOf(a);
					$scope.selectedCategory.splice(index, 1);
					console.log($scope.selectedCategory);
			}
			else{
				
			$scope.selectedCategory.push(a);
			console.log($scope.customfilter);
			console.log(b);
			console.log($scope.selectedCategory);
			}
			console.log($scope.f1);
			
			if($scope.selectedCategory.length==0)
			{	console.log('hhhhhx');
				$scope.selectedCategory = ['Mobile','Refrigerator','Camera','Laptop','Headphone'];
				count=0;
			}
		}
		
		$scope.containsComparator = function(expected, actual){  
			return actual.indexOf(expected) > -1;
		};
		$scope.filterreset = function(a,b){
			console.log('Invoked');

			$scope.selectedCategory = ['Mobile','Refrigerator','Camera','Laptop','Headphone'];
			$scope.f1=false;
			$scope.f2=false;
			$scope.f3=false;
			$scope.f4=false;
			$scope.f5=false;
			count=0;
			}
		$scope.cartproducts=[];
		$scope.cartproductcount='';	
		
		$scope.addtocart=function(x){
			x.isDisabled = true;
			x.quantity=1;
			if($scope.cartproductcount=='')
			{
				$scope.cartproductcount=1;
				$scope.cartproducts.push(x);
			}
			else{
				$scope.cartproductcount+=1;
				$scope.cartproducts.push(x);
			}
			console.log($scope.cartproducts);
			
		}	
		
		$scope.removefromcart=function(x){
				var searchTerm = x.Name,
				myindex = -1;
				for(var i = 0, len = $scope.cartproducts.length; i < len; i++) {
					if ($scope.cartproducts[i].Name === searchTerm) {
						myindex = i;
					break;
				}
				}			
					x.isDisabled=false;
					x.status = !x.status;
					$scope.cartproducts.splice(myindex, 1);
					$scope.cartproductcount-=1;
					if($scope.cartproductcount==0)
						{
						$scope.cartproductcount='';
						}
					
		}	
});
