<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$cropID=trim($_POST['cropID']);
	
	$stmt = mysqli_prepare($conn, "select * from `facility_harvest_table` where cropID='$cropID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $fHarvestTID, $cropID, $fHarvestTName);

 
	$facilityHarvestTable = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['fHarvestTID'] = $fHarvestTID; 
	$temp['cropID'] = $cropID; 
	$temp['fHarvestTName'] = $fHarvestTName; 
	
	
	
	array_push($facilityHarvestTable, $temp);
	}
	
	echo json_encode($facilityHarvestTable);


?>