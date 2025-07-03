<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$fInventoryTID=trim($_POST['fInventoryTID']);
	
	$stmt = mysqli_prepare($conn, "select faInventoryID,productName  from `facility_inventory_record` where fInventoryTID ='$fInventoryTID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $faInventoryID, $productName);

 
	$facilityInventoryRecord = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['faInventoryID'] = $faInventoryID; 
	$temp['productName'] = $productName; 
	
	
	
	array_push($facilityInventoryRecord, $temp);
	}
	
	echo json_encode($facilityInventoryRecord);




?>