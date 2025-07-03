<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$cropID=trim($_POST['cropID']);
	
	
	$stmt = mysqli_prepare($conn, "SELECT * FROM crop_employee_authorization WHERE cropID = '$cropID' ");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $cropEAID, $cropID, $employeeID, $allowBreedRecord, $allowHarvestRecord, $allowInventoryRecord);

 
	$cropEmployeeAuthorization = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['cropEAID'] = $cropEAID; 
	$temp['cropID'] = $cropID; 
	$temp['employeeID'] = $employeeID; 
	$temp['allowBreedRecord'] = $allowBreedRecord; 
	$temp['allowHarvestRecord'] = $allowHarvestRecord;
	$temp['allowInventoryRecord'] = $allowInventoryRecord;
	
	
	
	array_push($cropEmployeeAuthorization, $temp);
	}
	
	echo json_encode($cropEmployeeAuthorization);


?>