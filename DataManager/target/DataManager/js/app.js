var app= angular.module('DataManager',[]);
app.controller('appController',function($scope,$http){
	$scope.test = "From Angular JS";
	$url = "http://localhost:8080/DataManager/api/";
	loadDistricts();
	
	function loadDistricts(){
		//alert("method hit");
		$http.get($url+"listDistricts").then(function (response) {
			$scope.districts = response.data;
		});
	}
});