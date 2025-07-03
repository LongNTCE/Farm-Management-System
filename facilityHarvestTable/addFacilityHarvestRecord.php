<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

    	$pondID=trim($_POST['pondID']);
    	$fHarvestTID=trim($_POST['fHarvestTID']);
    	$harvestDate=trim($_POST['harvestDate']);
        $harvestNetWeight=trim($_POST['harvestNetWeight']);
        $harvestWeight=trim($_POST['harvestWeight']);
        $merchantNameAddress=trim($_POST['merchantNameAddress']);
     

	


        $query1="INSERT INTO `facility_harvest_record`(`fHarvestTID`, `pondID`, `harvestDate`, `harvestNetWeight`, `harvestWeight`, `merchantNameAddress`) VALUES ('$fHarvestTID','$pondID','$harvestDate','$harvestNetWeight','$harvestWeight','$merchantNameAddress');";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>