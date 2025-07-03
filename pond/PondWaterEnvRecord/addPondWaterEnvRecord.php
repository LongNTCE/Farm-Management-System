<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

       
	    $pondWaterEnvTID=trim($_POST['pondWaterEnvTID']);
    	$envDate=trim($_POST['envDate']);
    	$dissolveOxygen_morning=trim($_POST['dissolveOxygen_morning']);
    	$dissolveOxygen_afternoon=trim($_POST['dissolveOxygen_afternoon']);
        $pH_morning=trim($_POST['pH_morning']);
        $pH_afternoon=trim($_POST['pH_afternoon']);
        $temperature_morning=trim($_POST['temperature_morning']);
        $temperature_afternoon=trim($_POST['temperature_afternoon']);
        $salinity=trim($_POST['salinity']);
        $purity=trim($_POST['purity']);
        $NH3=trim($_POST['NH3']);
        $alkali=trim($_POST['alkali']);
        $H2S=trim($_POST['H2S']);

      

        $query1="INSERT INTO `pond_waterenvironment_record`(`pondWaterEnvTID`, `envDate`, `dissolveOxygen_morning`, `dissolveOxygen_afternoon`, `pH_morning`, `pH_afternoon`, `temperature_morning`, `temperature_afternoon`, `salinity`, `purity`, `NH3`, `alkali`, `H2S`) VALUES ('$pondWaterEnvTID','$envDate','$dissolveOxygen_morning','$dissolveOxygen_afternoon','$pH_morning','$pH_afternoon','$temperature_morning', '$temperature_afternoon','$salinity', '$purity', '$NH3', '$alkali', '$H2S');";


        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>