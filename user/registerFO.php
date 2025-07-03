<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

    $foEmail=trim($_POST['foEmail']);
    $foFullName=trim($_POST['foFullName']);
    $foPhone=trim($_POST['foPhone']);
	$foPassword=trim($_POST['foPassword']);

    $query="select * from facilityowner where foEmail='$foEmail'";
    $raw=mysqli_query($conn,$query);
    $count=mysqli_num_rows($raw);

    $query2="select * from facilityowner where foPhone='$foPhone'";
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
        $query1="INSERT INTO `facilityowner` (`foEmail`, `foFullName`, `foPhone`, `foPassword`) 
        VALUES ('$foEmail', '$foFullName', '$foPhone', '$foPassword');";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="Sign up successful";
        else
        $response="Sign up failed";
    }

    echo $response;

?>