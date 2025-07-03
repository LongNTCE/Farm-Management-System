<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$cropID=trim($_POST['cropID']);
	$pondName=trim($_POST['pondName']);
	
	
	$stmt = mysqli_prepare($conn, "SELECT pond.pondID,pond.pondCode,pond.pondName,pond.pondSquare FROM pond INNER JOIN `crop - pond` ON pond.pondID = `crop - pond`.pondID WHERE `crop - pond`.cropID ='$cropID' AND `pond`.pondName = '$pondName'");



	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $pondID, $pondCode, $pondName, $pondSquare);

 
	$pond = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondID'] = $pondID; 
	$temp['pondCode'] = $pondCode; 
	$temp['pondName'] = $pondName; 
	$temp['pondSquare'] = $pondSquare; 
	
	
	array_push($pond, $temp);
	}
	
	echo json_encode($pond);


?>