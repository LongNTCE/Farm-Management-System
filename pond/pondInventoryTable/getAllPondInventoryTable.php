<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondID=trim($_POST['pondID']);
	
	$stmt = mysqli_prepare($conn, "select * from `pond_inventory_table` where pondID='$pondID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $pondInventoryTID , $pondID, $pondInventoryTName);

 
	$pondInventoryTable = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondInventoryTID'] = $pondInventoryTID; 
	$temp['pondID'] = $pondID; 
	$temp['pondInventoryTName'] = $pondInventoryTName; 
	
	
	
	array_push($pondInventoryTable, $temp);
	}
	
	echo json_encode($pondInventoryTable);


?>