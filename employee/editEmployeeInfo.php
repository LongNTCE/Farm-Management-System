<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

$employeeID=trim($_POST['employeeID']);
    $employeeEmail=trim($_POST['employeeEmail']);
    $employeeFullName=trim($_POST['employeeFullName']);
    $employeePhone=trim($_POST['employeePhone']);
	$employeePassword=trim($_POST['employeePassword']);


    
    
    $query1="select * from employee where employeePhone='$employeePhone'";
    $raw1=mysqli_query($conn,$query1);
    $count1=mysqli_num_rows($raw1);

    
    $query3="select * from employee where employeeEmail='$employeeEmail' and employeePhone='$employeePhone'";
    $raw3=mysqli_query($conn,$query3);
    $count3=mysqli_num_rows($raw3);

   if ($count1>0 && $count3==0) {
        $response="no";
    }
    else{

        $query="UPDATE `employee` SET `employeeFullName` =  '$employeeFullName', `employeeEmail` = '$employeeEmail', `employeePassword` = '$employeePassword', `employeePhone` = '$employeePhone' WHERE `employee`.`employeeID` = $employeeID;";
        $res=mysqli_query($conn,$query);
        if($res==true)
        $response="success";
        else
        $response="failed";
    }

    echo $response;

mysql_close($conn)
?>