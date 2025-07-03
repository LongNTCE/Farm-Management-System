
<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$cropID=trim($_POST['cropID']);
	
	$stmt = mysqli_prepare($conn, "select pond.pondID FROM pond INNER JOIN `crop - pond` ON pond.pondID = `crop - pond`.pondID WHERE `crop - pond`.cropID =$cropID ORDER BY `pondID` DESC LIMIT 1");
	mysqli_stmt_execute($stmt);
 
	
	mysqli_stmt_bind_result($stmt, $pondID);

 
	$crop = array(); 

	while(mysqli_stmt_fetch($stmt)){
		
	$temp = array();
	$temp['pondID'] = $pondID; 
	
	array_push($crop, $temp);
	}
	
	echo json_encode($crop);


?>