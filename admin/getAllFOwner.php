<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");


	$stmt = mysqli_prepare($conn, "SELECT * FROM `facilityowner` WHERE 1");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt ,$foID, $foFullName, $foEmail, $foPassword,   $foPhone);

 
	$facilityOwner = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['foID'] = $foID; 
	$temp['foFullName'] = $foFullName; 
	$temp['foEmail'] = $foEmail;
    $temp['foPassword'] = $foPassword; 
    $temp['foPhone'] = $foPhone; 

	
	array_push($facilityOwner, $temp);
	}
	
	echo json_encode($facilityOwner);


?>