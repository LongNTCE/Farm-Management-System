<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	
    $pondEnvID=trim($_POST['pondEnvID']);
    	$pondWaterEnvTID=trim($_POST['pondWaterEnvTID']);

    	$envDate=trim($_POST['envDate']);
    	$dissolveOxygen_morning=trim($_POST['dissolveOxygen_morning']);
        $dissolveOxygen_afternoon=trim($_POST['dissolveOxygen_afternoon']);
        $pH_morning=trim($_POST['pH_morning']);
        $pH_afternoon=trim($_POST['pH_afternoon']);
        $temperature_morning=trim($_POST['temperature_morning']);
        $temperature_afternoon=trim($_POST['estimateSurvivalRate']);
        $salinity=trim($_POST['salinity']);
    	$purity=trim($_POST['purity']);
        $NH3=trim($_POST['NH3']);
        $alkali=trim($_POST['alkali']);
        $H2S=trim($_POST['H2S']);


	

	

        $query1="UPDATE `pond_waterenvironment_record` SET `envDate` = '$envDate',`dissolveOxygen_morning` = '$dissolveOxygen_morning'
        ,`dissolveOxygen_afternoon` = '$dissolveOxygen_afternoon'
        ,`pH_morning` = '$pH_morning'
        ,`pH_afternoon` = '$pH_afternoon'
        ,`temperature_morning` = '$temperature_morning'
        ,  `temperature_afternoon` = '$temperature_afternoon'
        ,  `salinity` = '$salinity'  ,  `purity` = '$purity' ,  `NH3` = '$NH3',  `alkali` = '$alkali', `H2S` = '$H2S'
          WHERE `pond_waterenvironment_record`.`pondEnvID` = '$pondEnvID'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>