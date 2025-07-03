
<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$facilityID=trim($_POST['facilityID']);
	$employeeID=trim($_POST['employeeID']);
	
	$stmt = mysqli_prepare($conn, "select * from `crop` where `facilityID`='$facilityID' ORDER BY `cropID` DESC LIMIT 1;");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $cropID, $facilityID, $cropName, $cropStartDate, $cropEndDate);

 
	$crop = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['cropID'] = $cropID; 
	$temp['facilityID'] = $facilityID; 
	$temp['cropName'] = $cropName; 
	$temp['cropStartDate'] = $cropStartDate; 
	$temp['cropEndDate'] = $cropEndDate;
	
	
	array_push($crop, $temp);
	}
	
	echo json_encode($crop);


?>