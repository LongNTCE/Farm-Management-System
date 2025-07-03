<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$cropID=trim($_POST['cropID']);
	
	$stmt = mysqli_prepare($conn, "select * from `facility_breed_table` where cropID='$cropID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $fBreedTID, $cropID, $fBreedTName);

 
	$facilityBreedTable = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['fBreedTID'] = $fBreedTID; 
	$temp['cropID'] = $cropID; 
	$temp['fBreedTName'] = $fBreedTName; 
	
	
	
	array_push($facilityBreedTable, $temp);
	}
	
	echo json_encode($facilityBreedTable);


?>