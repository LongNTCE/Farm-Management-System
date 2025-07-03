<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");


	$stmt = mysqli_prepare($conn, "SELECT * FROM `cooperative` WHERE 1");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt ,$coID , $coName, $coEmail, $coPassword, $coPhone, $coAddress);

 
	$cooperative = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['coID'] = $coID; 
	$temp['coName'] = $coName; 
	$temp['coEmail'] = $coEmail;
    $temp['coPassword'] = $coPassword; 
    $temp['coPhone'] = $coPhone; 
    $temp['coAddress'] = $coAddress;

	
	array_push($cooperative, $temp);
	}
	
	echo json_encode($cooperative);


?>