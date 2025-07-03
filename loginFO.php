<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$foEmail=trim($_POST['foEmail']);
    $foPassword=trim($_POST['foPassword']);
	
	$stmt = mysqli_prepare($conn, "select * from facilityowner where foEmail='$foEmail' and foPassword ='$foPassword' limit 1");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $id, $name, $email, $password, $phone);

 
	$fo = array(); 

	while(mysqli_stmt_fetch($stmt)){
	$temp = array();
	$temp['id'] = $id; 
	$temp['name'] = $name; 
	$temp['email'] = $email; 
	$temp['password'] = $password; 
	$temp['phone'] = $password;
	array_push($fo, $temp);
	}
	
	echo json_encode($fo);


?>