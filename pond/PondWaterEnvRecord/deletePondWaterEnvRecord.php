<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondEnvID =trim($_POST['pondEnvID']);

 
 $query1="DELETE FROM `pond_waterenvironment_record` WHERE pondEnvID ='$pondEnvID'";
 
 
        $res=mysqli_query($conn,$query1);
      
        if($res==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>