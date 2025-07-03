<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

    $coEmail=trim($_POST['coEmail']);
    $coName=trim($_POST['coName']);
    $coPhone=trim($_POST['coPhone']);
	$coPassword=trim($_POST['coPassword']);
    $coAddress=trim($_POST['coAddress']);
    
    $query="select * from cooperative where coEmail='$coEmail'";
    $query2="select * from cooperative where coPhone='$coPhone'";
    
    $raw=mysqli_query($conn,$query);
    $count=mysqli_num_rows($raw);

    $raw2=mysqli_query($conn,$query2);
    $count2=mysqli_num_rows($raw2);

    if($count>0)
    {
            $response="Email exist";
    }
    elseif ($count2>0) {
        $response="Phone number exist";
    }
	
    else
    {
        $query1="INSERT INTO `cooperative` (`coEmail`, `coName`, `coPhone`, `coPassword`, `coAddress`) 
        VALUES ('$coEmail', '$coName', '$coPhone', '$coPassword', '$coAddress');";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="Sign up successful";
        else
        $response="Sign up failed";
    }

    echo $response;

?>