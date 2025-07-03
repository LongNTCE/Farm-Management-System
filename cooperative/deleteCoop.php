<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$coID =trim($_POST['coID']);

 $query2="DELETE FROM `cooperative - facility` WHERE coID ='$coID'";
 $query1="DELETE FROM `cooperative` WHERE coID ='$coID'";

 
        $res2=mysqli_query($conn,$query2);
        $res1=mysqli_query($conn,$query1);
       
        if($res==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>	