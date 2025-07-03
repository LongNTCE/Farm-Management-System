<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$employeeID=trim($_POST['employeeID']);
	

	$stmt = mysqli_prepare($conn, "SELECT * FROM `employee` WHERE employeeID  = '$employeeID'");
	mysqli_stmt_execute($stmt);
 
	mysqli_stmt_bind_result($stmt, $employeeID  , $employeeFullName , $employeeEmail, $employeePassword, $employeePhone);


	$employee = array(); 


	while(mysqli_stmt_fetch($stmt)){
		

	$temp = array();
	$temp['employeeID'] = $employeeID; 
	$temp['employeeFullName'] = $employeeFullName; 
	$temp['employeeEmail'] = $employeeEmail; 
    $temp['employeePassword'] = $employeePassword; 
	$temp['employeePhone'] = $employeePhone; 
	
	
	array_push($employee, $temp);
	}
	
	echo json_encode($employee);


?>