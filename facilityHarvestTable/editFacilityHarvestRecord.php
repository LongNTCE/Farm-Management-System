<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	    $fHarvestID=trim($_POST['fHarvestID']);
    	$pondID=trim($_POST['pondID']);
    	
    	$harvestDate=trim($_POST['harvestDate']);
        $harvestNetWeight=trim($_POST['harvestNetWeight']);
        $harvestWeight=trim($_POST['harvestWeight']);
        $merchantNameAddress=trim($_POST['merchantNameAddress']);
     


        $query1="UPDATE `facility_harvest_record` SET `pondID` = '$pondID',`harvestDate` = '$harvestDate',`harvestNetWeight` = '$harvestNetWeight',`harvestWeight` = '$harvestWeight',`merchantNameAddress` = '$merchantNameAddress' WHERE `facility_harvest_record`.`fHarvestID` = '$fHarvestID'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>