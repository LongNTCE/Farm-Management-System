<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$facilityID=trim($_POST['facilityID']);
	
	$stmt = mysqli_prepare($conn, "SELECT  `employee`.`employeeID`, `employeeFullName`, `employeeEmail`, `employeePassword`, `employeePhone` FROM `employee` LEFT JOIN `facility - employee` ON `employee`.`employeeID` = `facility - employee`.`employeeID` WHERE `facility - employee`.`facilityID` = '$facilityID'");
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