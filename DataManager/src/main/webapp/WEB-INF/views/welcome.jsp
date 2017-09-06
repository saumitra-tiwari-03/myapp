<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADCC Data Manager</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script src="js/app.js"></script>
<script src="js/bootstrap-select/js/bootstrap-select.js"></script>
</head>
<body ng-app="DataManager" ng-controller="appController">
	<div class="container">
		<h1>ADCC Data Manager - Water Project</h1>
		<div class="table-responsive">
			<table class="table">
				<tr>
					<td>Select District:</td>
					<td>
						<div class="form-group">
							<select class="form-control" ng-model="district" ng-options="d.tname for d in districts"></select>
						</div>
					</td>
					<td>
						<button type="button" class="btn btn-primary">Search</button>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
