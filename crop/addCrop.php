<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$fID=trim($_POST['facilityID']);
    	$cropName=trim($_POST['cropName']);
    	$cropStartDate=trim($_POST['cropStartDate']);
    	$cropEndDate=trim($_POST['cropEndDate']);

	


        $query1="INSERT INTO `crop` (`facilityID`, `cropName`, `cropStartDate`, `cropEndDate`) VALUES ('$fID', '$cropName', '$cropStartDate', '$cropEndDate');";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>