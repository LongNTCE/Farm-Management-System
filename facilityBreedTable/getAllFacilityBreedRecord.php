<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$fBreedTID =trim($_POST['fBreedTID']);

	
	$stmt = mysqli_prepare($conn, "select `facility_breed_record`.`fBreedID`, `facility_breed_record`.`fBreedTID`,`pond`.`pondName`,`facility_breed_record`.`breedDate`,`facility_breed_record`.`breedSize`,`facility_breed_record`.`breedDensity`,`facility_breed_record`.`breedSourceName`,`facility_breed_record`.`breedCertificateID` from `facility_breed_record` JOIN `pond` ON `facility_breed_record`.`pondID` = `pond`.`pondID` where fBreedTID ='$fBreedTID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $fBreedID, $fBreedTID, $pondName, $breedDate, $breedSize, $breedDensity, $breedSourceName, $breedCertificateID);

 
	$facilityBreedRecord = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['fBreedID'] = $fBreedID; 
	$temp['fBreedTID'] = $fBreedTID; 
	$temp['pondName'] = $pondName; 
	$temp['breedDate'] = $breedDate; 
	$temp['breedSize'] = $breedSize; 
	$temp['breedDensity'] = $breedDensity; 
	$temp['breedSourceName'] = $breedSourceName; 
	$temp['breedCertificateID'] = $breedCertificateID; 
	
	
	
	array_push($facilityBreedRecord, $temp);
	}
	
	echo json_encode($facilityBreedRecord);


?>