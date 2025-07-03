<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$fHarvestID =trim($_POST['fHarvestID']);

 
 $query1="DELETE FROM `facility_harvest_record` WHERE fHarvestID ='$fHarvestID'";
 
 
        $res=mysqli_query($conn,$query1);
      
        if($res==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>