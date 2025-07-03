<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$foID=trim($_POST['foID']);
	
	$stmt = mysqli_prepare($conn, "select * from facility where foID='$foID'");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $facilityID, $foID, $fName, $fAddress, $fPhone, $fTotalSquare, $fCultivatingPondSquare, $fStoragePondSquare, $fWastePondSquare, $fCultivatingObject, $fCultivatingTime);

 
	$facility = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['facilityID'] = $facilityID; 
	$temp['foID'] = $foID; 
	$temp['fName'] = $fName; 
	$temp['fAddress'] = $fAddress; 
	$temp['fPhone'] = $fPhone;
	$temp['fTotalSquare'] = $fTotalSquare;
	$temp['fCultivatingPondSquare'] = $fCultivatingPondSquare;
	$temp['fStoragePondSquare'] = $fStoragePondSquare;
	$temp['fWastePondSquare'] = $fWastePondSquare;
	$temp['fCultivatingObject'] = $fCultivatingObject;
	$temp['fCultivatingTime'] = $fCultivatingTime;
	
	array_push($facility, $temp);
	}
	
	echo json_encode($facility);


?>