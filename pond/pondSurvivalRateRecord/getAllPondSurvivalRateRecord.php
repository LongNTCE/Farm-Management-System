<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondSurvivalRateTID =trim($_POST['pondSurvivalRateTID']);
	
	$stmt = mysqli_prepare($conn, "select * from `pond_survivalrate_record` where pondSurvivalRateTID ='$pondSurvivalRateTID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $pondSurvivalRateID, $pondSurvivalRateTID,  $survivalDate, $survivalMediumWeight,  $deathNumber, $lossNumber, $diseaseNumber, $diseaseSign, $estimateSurvivalRate);

 
	$pondSurvivalRateRecord = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondSurvivalRateID'] = $pondSurvivalRateID; 
	$temp['pondSurvivalRateTID'] = $pondSurvivalRateTID; 
	$temp['survivalDate'] = $survivalDate; 
	$temp['survivalMediumWeight'] = $survivalMediumWeight; 
	$temp['deathNumber'] = $deathNumber; 
	$temp['lossNumber'] = $lossNumber; 
	$temp['diseaseNumber'] = $diseaseNumber; 
	$temp['diseaseSign'] = $diseaseSign; 
    $temp['estimateSurvivalRate'] = $estimateSurvivalRate; 
	
	
	
	array_push($pondSurvivalRateRecord, $temp);
	}
	
	echo json_encode($pondSurvivalRateRecord);


?>