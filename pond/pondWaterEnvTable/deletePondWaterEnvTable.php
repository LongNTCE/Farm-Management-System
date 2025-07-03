<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondWaterEnvTID =trim($_POST['pondWaterEnvTID']);

 
 $query1="DELETE FROM `pond_waterenvironment_record` WHERE pondWaterEnvTID ='$pondWaterEnvTID'";
 $query2="DELETE FROM `pond_waterenv_table` WHERE pondWaterEnvTID ='$pondWaterEnvTID'";
 
        $res=mysqli_query($conn,$query1);
        $res2=mysqli_query($conn,$query2);
        if($res2==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>