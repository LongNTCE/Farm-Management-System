<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	    $fBreedID=trim($_POST['fBreedID']);
    	$pondID=trim($_POST['pondID']);
    	$breedDate=trim($_POST['breedDate']);
        $breedSize=trim($_POST['breedSize']);
        $breedDensity=trim($_POST['breedDensity']);
        $breedSourceName=trim($_POST['breedSourceName']);
        $breedCertificateID=trim($_POST['breedCertificateID']);



        $query1="UPDATE `facility_breed_record` SET `pondID` = '$pondID',`breedDate` = '$breedDate',`breedSize` = '$breedSize',`breedDensity` = '$breedDensity',`breedSourceName` = '$breedSourceName',`breedCertificateID` = '$breedCertificateID' WHERE `facility_breed_record`.`fBreedID` = '$fBreedID'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>