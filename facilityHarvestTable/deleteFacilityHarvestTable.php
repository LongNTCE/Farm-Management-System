<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$fHarvestTID =trim($_POST['fHarvestTID']);

 
 $query1="DELETE FROM `facility_harvest_record` WHERE fHarvestTID ='$fHarvestTID'";
 $query2="DELETE FROM `facility_harvest_table` WHERE fHarvestTID ='$fHarvestTID'";
 
        $res=mysqli_query($conn,$query1);
        $res2=mysqli_query($conn,$query2);
        if($res2==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>