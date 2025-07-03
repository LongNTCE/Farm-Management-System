<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

    $employeeEmail=trim($_POST['employeeEmail']);
    $employeeFullName=trim($_POST['employeeFullName']);
    $employeePhone=trim($_POST['employeePhone']);
	$employeePassword=trim($_POST['employeePassword']);

    $query="select * from employee where employeeEmail='$employeeEmail'";
    $raw=mysqli_query($conn,$query);
    $count=mysqli_num_rows($raw);

    $query2="select * from employee where employeePhone='$employeePhone'";
    $raw2=mysqli_query($conn,$query2);
    $count2=mysqli_num_rows($raw2);


    if($count>0)
    {
        $response="Email exist";
    }elseif ($count2>0) {
        $response="Phone number exist";
    }
	
    else
    {
        $query1="INSERT INTO `employee` (`employeeEmail`, `employeeFullName`, `employeePhone`, `employeePassword`) 
        VALUES ('$employeeEmail', '$employeeFullName', '$employeePhone', '$employeePassword');";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="Sign up successful";
        else
        $response="Sign up failed";
    }

    echo $response;

?>