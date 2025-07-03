<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$facilityID=trim($_POST['facilityID']);
    $fName=trim($_POST['fName']);
    $fAddress=trim($_POST['fAddress']);
    $fPhone=trim($_POST['fPhone']);
	$fTotalSquare=trim($_POST['fTotalSquare']);
	$fCultivatePond=trim($_POST['fCultivatePond']);
	$fStoragePond=trim($_POST['fStoragePond']);
	$fWastePond=trim($_POST['fWastePond']);
	$fCultivatingObject=trim($_POST['fCultivatingObject']);
	$fCultivateTime=trim($_POST['fCultivateTime']);
	
   
 
        $query1="UPDATE `facility` SET `fName` = '$fName', `fAddress` = '$fAddress', `fPhone` = '$fPhone', `fCultivatingPondSquare` = '$fCultivatePond', `fStoragePondSquare` = '$fStoragePond', `fWastePondSquare` = '$fWastePond', `fCultivatingObject` = '$fCultivatingObject', `fCultivatingTime` = '$fCultivateTime', `fTotalSquare` = '$fTotalSquare' WHERE `facility`.`facilityID` = '$facilityID'";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";
    

        

    echo $response;

?>