<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$foID=trim($_POST['foID']);
    $fName=trim($_POST['fName']);
    $fAddress=trim($_POST['fAddress']);
    $fPhone=trim($_POST['fPhone']);
	$fTotalSquare=trim($_POST['fTotalSquare']);
	$fCultivatePond=trim($_POST['fCultivatePond']);
	$fStoragePond=trim($_POST['fStoragePond']);
	$fWastePond=trim($_POST['fWastePond']);
	$fCultivateObj=trim($_POST['fCultivateObj']);
	$fCultivateTime=trim($_POST['fCultivateTime']);
	
   
 
        $query1="INSERT INTO `facility` (`facilityID`, `foID`, `fName`, `fAddress`, `fPhone`, `fTotalSquare`, `fCultivatingPondSquare`, `fStoragePondSquare`, `fWastePondSquare`, `fCultivatingObject`, `fCultivatingTime`) 
        VALUES (NULL, '$foID', '$fName', '$fAddress', '$fPhone', '$fTotalSquare', '$fCultivatePond', '$fStoragePond', '$fWastePond', '$fCultivateObj', '$fCultivateTime')";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="success";
        else
        $response="failed";
    

        

    echo $response;

?>