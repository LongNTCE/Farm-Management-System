<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"apidb_test1");

	
	$stmt = $conn->prepare("SELECT id, name, email, password FROM user;");
 
	$stmt->execute();
	
	$stmt->bind_result($id, $name, $email, $password);
 
	$products = array(); 

	while($stmt->fetch()){
	$temp = array();
	$temp['id'] = $id; 
	$temp['name'] = $name; 
	$temp['email'] = $email; 
	$temp['password'] = $password; 
	array_push($products, $temp);
	}
	
	echo json_encode($products);

?>