<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

    $coID =trim($_POST['coID']);
    $coName=trim($_POST['coName']);
    $coEmail=trim($_POST['coEmail']);
    $coPhone=trim($_POST['coPhone']);
	$coPassword=trim($_POST['coPassword']);
    $coAddress=trim($_POST['coAddress']);
    



    $query1="select * from cooperative where coPhone='$coPhone'";
    $raw1=mysqli_query($conn,$query1);
    $count1=mysqli_num_rows($raw1);
 
    $query2="select * from cooperative where coEmail='$coEmail'";
    $raw2=mysqli_query($conn,$query2);
    $count2=mysqli_num_rows($raw2);
    
    $query3="select * from cooperative where coEmail='$coEmail' and coPhone='$coPhone'";
    $raw3=mysqli_query($conn,$query3);
    $count3=mysqli_num_rows($raw3);

   if ($count1>0 && $count3==0) {
        $response="no";
    }
    else{

        $query="UPDATE `cooperative` SET `coName` =  '$coName', `coEmail` = '$coEmail', `coPassword` = '$coPassword', `coPhone` = '$coPhone', `coAddress` = '$coAddress' WHERE `cooperative`.`coID` = $coID;";
        $res=mysqli_query($conn,$query);
        if($res==true)
        $response="success";
        else
        $response="failed";
    }

    echo $response;

?>