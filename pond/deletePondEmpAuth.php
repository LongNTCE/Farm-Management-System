<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondID =trim($_POST['pondID']);


 

 $query2="DELETE FROM `pond_employee_authorization` WHERE pondID ='$pondID'";
 
    
        $res2=mysqli_query($conn,$query2);
        if($res2==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>