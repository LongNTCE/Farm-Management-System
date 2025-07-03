<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondSurvivalRateTID =trim($_POST['pondSurvivalRateTID']);

 
 $query1="DELETE FROM `pond_survivalrate_record` WHERE pondSurvivalRateTID ='$pondSurvivalRateTID'";
 $query2="DELETE FROM `pond_survivalrate_table` WHERE pondSurvivalRateTID ='$pondSurvivalRateTID'";
 
        $res=mysqli_query($conn,$query1);
        $res2=mysqli_query($conn,$query2);
        if($res2==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>