<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondID =trim($_POST['pondID']);
	$employeeID =trim($_POST['employeeID']);

 

 $query2="DELETE FROM `pond_employee_authorization` WHERE pondID ='$pondID' AND employeeID = '$employeeID'";
 
    
        $res2=mysqli_query($conn,$query2);
        if($res2==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>