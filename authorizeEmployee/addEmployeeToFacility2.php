<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$facilityID=trim($_POST['facilityID']);
    $employeeID=trim($_POST['employeeID']);
    
    
    $query="select * from `facility - employee` where facilityID='$facilityID' AND employeeID= '$employeeID';";
    $raw=mysqli_query($conn,$query);
    $count=mysqli_num_rows($raw);

    if($count>0)
    {
        $response="exist";
    }
    else
    {
        $query1="INSERT INTO `facility - employee` (facilityID, employeeID) VALUES ('$facilityID', '$employeeID');";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    }
        echo $response;


?>