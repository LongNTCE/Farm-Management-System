<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$coEmail=trim($_POST['coEmail']);

	$stmt = mysqli_prepare($conn, "select * from cooperative where coEmail='$coEmail' limit 1");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $id, $name, $email, $password, $phone, $address);

 
	$co = array(); 

	while(mysqli_stmt_fetch($stmt)){
	$temp = array();
	$temp['id'] = $id; 
	$temp['name'] = $name; 
	$temp['email'] = $email; 
	$temp['password'] = $password; 
	$temp['phone'] = $phone;
	$temp['address'] = $address;
	array_push($co, $temp);
	}
	
	echo json_encode($co);


?>