<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$fHarvestTID =trim($_POST['fHarvestTID']);
	
	$stmt = mysqli_prepare($conn, "select `facility_harvest_record`.`fHarvestID`,`pond`.`pondName`,`facility_harvest_record`.`fHarvestTID`,`facility_harvest_record`.`harvestDate`,`facility_harvest_record`.`harvestNetWeight`,`facility_harvest_record`.`harvestWeight`,`facility_harvest_record`.`merchantNameAddress` FROM `facility_harvest_record` JOIN `pond` ON `facility_harvest_record`.`pondID` = `pond`.`pondID` where fHarvestTID ='$fHarvestTID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $fHarvestID, $pondName, $fHarvestTID, $harvestDate, $harvestNetWeight, $harvestWeight, $merchantNameAddress);

 
	$facilityHarvestRecord = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['fHarvestID'] = $fHarvestID; 
	$temp['pondName'] = $pondName; 
	$temp['fHarvestTID'] = $fHarvestTID; 
	$temp['harvestDate'] = $harvestDate; 
	$temp['harvestNetWeight'] = $harvestNetWeight; 
	$temp['harvestWeight'] = $harvestWeight; 
	$temp['merchantNameAddress'] = $merchantNameAddress; 

	
	
	
	array_push($facilityHarvestRecord, $temp);
	}
	
	echo json_encode($facilityHarvestRecord);


?>