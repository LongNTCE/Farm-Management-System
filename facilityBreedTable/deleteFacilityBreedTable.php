<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$fBreedTID =trim($_POST['fBreedTID']);

 
 $query1="DELETE FROM `facility_breed_record` WHERE fBreedTID ='$fBreedTID'";
 $query2="DELETE FROM `facility_breed_table` WHERE fBreedTID ='$fBreedTID'";
 
        $res=mysqli_query($conn,$query1);
        $res2=mysqli_query($conn,$query2);
        if($res2==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>