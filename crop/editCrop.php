<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	      	$cropID=trim($_POST['cropID']);
    	$cropName=trim($_POST['cropName']);
        $cropStartDate=trim($_POST['cropStartDate']);
        $cropEndDate=trim($_POST['cropEndDate']);
    



        $query1="UPDATE `crop` SET `cropName` = '$cropName',`cropStartDate` = '$cropStartDate',`cropEndDate` = '$cropEndDate' WHERE `crop`.`cropID` = '$cropID'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>