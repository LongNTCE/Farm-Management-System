<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$employeeID =trim($_POST['employeeID']);

 $query1="DELETE FROM `pond_employee_authorization` WHERE employeeID ='$employeeID'";
 $query2="DELETE FROM `crop_employee_authorization` WHERE employeeID ='$employeeID'";
 $query3="DELETE FROM `facility - employee` WHERE employeeID ='$employeeID'";
 $query4="DELETE FROM `employee` WHERE coID ='$coID'";

 
        $res1=mysqli_query($conn,$query1);
        $res2=mysqli_query($conn,$query2);
        $res3=mysqli_query($conn,$query3);
        $res4=mysqli_query($conn,$query4);
       
        if($res==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>	