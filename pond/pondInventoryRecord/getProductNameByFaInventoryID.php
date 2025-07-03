<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$faInventoryID  =trim($_POST['faInventoryID']);
	
	$stmt = mysqli_prepare($conn, "SELECT productName FROM facility_inventory_record WHERE faInventoryID = '$faInventoryID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt,e, $faInventoryID);

 
	$productName = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['productName'] = $productName; 


	
	
	
	array_push($productName, $temp);
	}
	
	echo json_encode($productName);


?>