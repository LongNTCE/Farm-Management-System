<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondID=trim($_POST['pondID']);
	
	$stmt = mysqli_prepare($conn, "select * from `pond_survivalrate_table` where pondID='$pondID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $pondSurvivalRateTID, $pondID, $pondSurvivalRateTName);

 
	$pondSurvivalRateTable = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondSurvivalRateTID'] = $pondSurvivalRateTID; 
	$temp['pondID'] = $pondID; 
	$temp['pondSurvivalRateTName'] = $pondSurvivalRateTName; 
	
	
	
	array_push($pondSurvivalRateTable, $temp);
	}
	
	echo json_encode($pondSurvivalRateTable);


?>