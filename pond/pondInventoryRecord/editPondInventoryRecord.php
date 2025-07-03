<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	
    $pondInventoryID=trim($_POST['pondInventoryID']);
    	$pondInventoryTID=trim($_POST['pondInventoryTID']);
    	$faInventoryID=trim($_POST['faInventoryID']);
    	$usageDate=trim($_POST['usageDate']);
        $dosage=trim($_POST['dosage']);
        $usageWeight=trim($_POST['usageWeight']);
        $usagePurpose=trim($_POST['usagePurpose']);


	

        $query1="UPDATE `pond_inventory_record` SET `usageDate` = '$usageDate',`dosage` = '$dosage',`usageWeight` = '$usageWeight',`usagePurpose` = '$usagePurpose'  WHERE `pond_inventory_record`.`pondInventoryID` = '$pondInventoryID'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>