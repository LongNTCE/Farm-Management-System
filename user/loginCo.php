<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

    $coEmail=trim($_POST['coEmail']);
    $coPassword=trim($_POST['coPassword']);
	
	
	$stmt = mysqli_prepare($conn, "select * from `cooperative` where coEmail='$coEmail' and coPassword ='$coPassword' limit 1");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $coID, $coName, $coEmail, $coPassword, $coPhone, $coAddress);

 
	$em = array(); 

	while(mysqli_stmt_fetch($stmt)){
	$temp = array();
	$temp['coID'] = $coID; 
	$temp['coName'] = $coName; 
	$temp['coEmail'] = $coEmail; 
	$temp['coPassword'] = $coPassword; 
	$temp['coPhone'] = $coPhone;
	$temp['coAddress'] = $coAddress;
	array_push($em, $temp);
	}
	
	echo json_encode($em);

?>