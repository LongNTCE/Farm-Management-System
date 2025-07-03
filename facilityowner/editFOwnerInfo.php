<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

$foID =trim($_POST['foID']);
    $foEmail=trim($_POST['foEmail']);
    $foFullName=trim($_POST['foFullName']);
    $foPhone=trim($_POST['foPhone']);
	$foPassword=trim($_POST['foPassword']);


    $query1="select * from facilityowner where foPhone='$foPhone'";
    $raw1=mysqli_query($conn,$query1);
    $count1=mysqli_num_rows($raw1);

    
    $query3="select * from facilityowner where foEmail='$foEmail' and foPhone='$foPhone'";
    $raw3=mysqli_query($conn,$query3);
    $count3=mysqli_num_rows($raw3);

   if ($count1>0 && $count3==0) {
        $response="no";
    }
    else{

        $query1=" UPDATE `facilityowner` SET `foFullName` =  '$foFullName', `foEmail` = '$foEmail', `foPhone` = '$foPhone', `foPassword` = '$foPassword' WHERE `facilityowner`.`foID` = '$foID' ;";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="success";
        else
        $response="failed";
    }

    echo $response;

?>