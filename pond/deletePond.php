<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondID =trim($_POST['pondID']);

 $query5="DELETE FROM `pond_employee_authorization` WHERE pondID ='$pondID'";
 $query0="DELETE FROM `facility_breed_record` WHERE pondID ='$pondID'";
 $query4="DELETE FROM `facility_harvest_record` WHERE pondID ='$pondID'";
 $query1="DELETE FROM `crop - pond` WHERE pondID ='$pondID'";
 $query2="DELETE FROM `pond` WHERE pondID ='$pondID'";
        
        $res5=mysqli_query($conn,$query5);
        $res0=mysqli_query($conn,$query0);
        $res4=mysqli_query($conn,$query4);
        $res=mysqli_query($conn,$query1);
        $res2=mysqli_query($conn,$query2);
        
       
        if($res2==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>