<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondInventoryTID  =trim($_POST['pondInventoryTID']);
	
	$stmt = mysqli_prepare($conn, "select `pond_inventory_record`.`pondInventoryID`,`pond_inventory_record`.`pondInventoryTID`,`pond_inventory_record`.`faInventoryID`,`pond_inventory_record`.`usageDate`,`facility_inventory_record`.`productName`,`pond_inventory_record`.`dosage`,`pond_inventory_record`.`usageWeight`,`pond_inventory_record`.`usagePurpose` from `pond_inventory_record` JOIN `facility_inventory_record`ON `pond_inventory_record`.`faInventoryID` = `facility_inventory_record`.`faInventoryID` where pondInventoryTID =$pondInventoryTID");
	mysqli_stmt_execute($stmt);
 
 

	
	mysqli_stmt_bind_result($stmt, $pondInventoryID, $pondInventoryTID,  $faInventoryID, $usageDate, $productName, $dosage, $usageWeight, $usagePurpose);

 
	$pondInventoryRecord = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondInventoryID'] = $pondInventoryID; 
	$temp['pondInventoryTID'] = $pondInventoryTID; 
	$temp['faInventoryID'] = $faInventoryID; 
	$temp['usageDate'] = $usageDate; 
	$temp['productName'] = $productName; 
	$temp['dosage'] = $dosage; 
	$temp['usageWeight'] = $usageWeight; 
	$temp['usagePurpose'] = $usagePurpose; 

	
	
	
	array_push($pondInventoryRecord, $temp);
	}
	
	echo json_encode($pondInventoryRecord);


?>