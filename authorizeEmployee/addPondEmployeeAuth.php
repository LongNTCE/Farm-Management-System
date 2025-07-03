<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondID=trim($_POST['pondID']);
    $employeeID=trim($_POST['employeeID']);
  
	


        $query1="INSERT INTO pond_employee_authorization (pondID, employeeID, allowInventoryRecord, allowSurvivalRecord, allowWaterRecord) VALUES ('$pondID', '$employeeID', '0', '0', '0');";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted epa";
        else
        $response="failed epa";

    echo $response;

?>