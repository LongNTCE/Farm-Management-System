<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondWaterEnvTID =trim($_POST['pondWaterEnvTID']);
	
	$stmt = mysqli_prepare($conn, "select * from `pond_waterenvironment_record` where pondWaterEnvTID ='$pondWaterEnvTID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $pondEnvID, $pondWaterEnvTID, $envDate, $dissolveOxygen_morning, $dissolveOxygen_afternoon,
     $pH_morning, $pH_afternoon, $temperature_morning, $temperature_afternoon, $salinity, $purity, $NH3,  $alkali, $H2S);

 
	$pondWaterEnvRecord = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondEnvID'] = $pondEnvID; 
	$temp['pondWaterEnvTID'] = $pondWaterEnvTID; 
	$temp['envDate'] = $envDate; 
	$temp['dissolveOxygen_morning'] = $dissolveOxygen_morning; 
	$temp['dissolveOxygen_afternoon'] = $dissolveOxygen_afternoon; 
	$temp['pH_morning'] = $pH_morning; 
	$temp['pH_afternoon'] = $pH_afternoon; 
	$temp['temperature_morning'] = $temperature_morning; 
    $temp['temperature_afternoon'] = $temperature_afternoon; 
	$temp['salinity'] = $salinity; 
	$temp['purity'] = $purity; 
    $temp['NH3'] = $NH3; 
	$temp['alkali'] = $alkali; 
	$temp['H2S'] = $H2S; 
	
	
	
	array_push($pondWaterEnvRecord, $temp);
	}
	
	echo json_encode($pondWaterEnvRecord);


?>