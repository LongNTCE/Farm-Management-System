<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

    $adminEmail=trim($_POST['adminEmail']);
    $adminPassword=trim($_POST['adminPassword']);
	
	
	$stmt = mysqli_prepare($conn, "select * from admin where adminEmail='$adminEmail' and adminPassword ='$adminPassword' limit 1");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $adminID, $adminEmail, $adminPassword);

 
	$ad = array(); 

	while(mysqli_stmt_fetch($stmt)){
	$temp = array();
	$temp['adminID'] = $adminID; 
	$temp['adminEmail'] = $adminEmail; 
	$temp['adminPassword'] = $adminPassword; 
	array_push($ad, $temp);
	}
	
	echo json_encode($ad);

?>