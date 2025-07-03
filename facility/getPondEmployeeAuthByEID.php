<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");


	$employeeID=trim($_POST['employeeID']);
	
	$stmt = mysqli_prepare($conn, "SELECT * FROM `pond_employee_authorization` WHERE employeeID = '$employeeID' ");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $pondEAID, $pondID, $employeeID, $allowInventoryRecord, $allowSurvivalRecord, $allowWaterRecord);

 
	$pondEmployeeAuthorization = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondEAID'] = $pondEAID; 
	$temp['pondID'] = $pondID; 
	$temp['employeeID'] = $employeeID; 
	$temp['allowInventoryRecord'] = $allowInventoryRecord; 
	$temp['allowSurvivalRecord'] = $allowSurvivalRecord;
	$temp['allowWaterRecord'] = $allowWaterRecord;
	
	
	
	array_push($pondEmployeeAuthorization, $temp);
	}
	
	echo json_encode($pondEmployeeAuthorization);


?>