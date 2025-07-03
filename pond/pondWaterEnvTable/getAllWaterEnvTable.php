<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondID=trim($_POST['pondID']);
	
	$stmt = mysqli_prepare($conn, "select * from `pond_waterenv_table` where pondID='$pondID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $pondWaterEnvTID , $pondID, $pondEnvTName);

 
	$pondWaterEnvTable = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondWaterEnvTID'] = $pondWaterEnvTID; 
	$temp['pondID'] = $pondID; 
	$temp['pondEnvTName'] = $pondEnvTName; 
	
	
	
	array_push($pondWaterEnvTable, $temp);
	}
	
	echo json_encode($pondWaterEnvTable);


?>