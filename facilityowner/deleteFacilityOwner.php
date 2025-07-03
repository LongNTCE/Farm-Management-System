<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$foID =trim($_POST['foID']);

 
 $query4="DELETE FROM `facilityowner` WHERE foID ='$foID'";

 
     
        $res4=mysqli_query($conn,$query4);
       
        if($res4==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>	