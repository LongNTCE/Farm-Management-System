<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$employeeID=trim($_POST['employeeID']);
	
	$stmt = mysqli_prepare($conn, "SELECT `facility`.`facilityID`,`facility`.`foID`, `facility`.`fName`, `facility`.`fAddress`, `facility`.`fPhone`, `facility`.`fTotalSquare`, `facility`.`fCultivatingPondSquare`, `facility`.`fStoragePondSquare`, `facility`.`fWastePondSquare`, `facility`.`fCultivatingObject`, `facility`.`fCultivatingTime` FROM `facility` JOIN `facility - employee` ON `facility`.`facilityID`=`facility - employee`.`facilityID` WHERE `facility - employee`.`employeeID` = '$employeeID'");
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