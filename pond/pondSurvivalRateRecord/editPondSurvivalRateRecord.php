<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	
    $pondSurvivalRateID=trim($_POST['pondSurvivalRateID']);
    	$pondSurvivalRateTID=trim($_POST['pondSurvivalRateTID']);
    	$survivalDate=trim($_POST['survivalDate']);
    	$survivalMediumWeight=trim($_POST['survivalMediumWeight']);
        $deathNumber=trim($_POST['deathNumber']);
        $lossNumber=trim($_POST['lossNumber']);
        $diseaseNumber=trim($_POST['diseaseNumber']);
        $diseaseSign=trim($_POST['diseaseSign']);
        $estimateSurvivalRate=trim($_POST['estimateSurvivalRate']);

	

        $query1="UPDATE `pond_survivalrate_record` SET `survivalDate` = '$survivalDate',`survivalMediumWeight` = '$survivalMediumWeight',`deathNumber` = '$deathNumber',`lossNumber` = '$lossNumber',`diseaseNumber` = '$diseaseNumber',`diseaseSign` = '$diseaseSign',  `estimateSurvivalRate` = '$estimateSurvivalRate' WHERE `pond_survivalrate_record`.`pondSurvivalRateID` = '$pondSurvivalRateID'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>