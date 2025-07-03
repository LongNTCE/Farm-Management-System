<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$cropID=trim($_POST['cropID']);
    $employeeID=trim($_POST['employeeID']);
  
	


        $query1="INSERT INTO `crop_employee_authorization` (cropID, employeeID, allowBreedRecord, allowHarvestRecord, allowInventoryRecord) VALUES ('$cropID', '$employeeID', '0', '0', '0');";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>