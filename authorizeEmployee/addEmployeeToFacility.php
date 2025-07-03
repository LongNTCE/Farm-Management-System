<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$employeeEmail =trim($_POST['employeeEmail']);

 
    $stmt = mysqli_prepare($conn, "SELECT * from `employee` where employeeEmail = '$employeeEmail'");
 	mysqli_stmt_execute($stmt);

 

 
	mysqli_stmt_bind_result($stmt, $employeeID, $employeeFullName, $employeeEmail, $employeePassword, $employeePhone);

 
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