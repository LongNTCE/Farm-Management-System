<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$facilityID =trim($_POST['facilityID']);
	$employeeID =trim($_POST['employeeID']);

 
 $query="DELETE FROM `pond_employee_authorization` WHERE facilityID ='$facilityID' AND employeeID = '$employeeID'";
 $query="DELETE FROM `facility - employee` WHERE facilityID ='$facilityID' AND employeeID = '$employeeID'";
 
    
        $res=mysqli_query($conn,$query);
        if($res==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>