<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$facilityID =trim($_POST['facilityID']);

 $query1="DELETE FROM `facility - employee` WHERE facilityID ='$facilityID'";
 $query2="DELETE FROM `cooperative - facility` WHERE facilityID ='$facilityID'";
 $query3="DELETE FROM `crop` WHERE facilityID ='$facilityID'";
 $query4="DELETE FROM `facility` WHERE facilityID ='$facilityID'";
 
        $res=mysqli_query($conn,$query1);
        $res2=mysqli_query($conn,$query2);
        $res3=mysqli_query($conn,$query3);
        $res4=mysqli_query($conn,$query4);
       
        if($res4==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>	