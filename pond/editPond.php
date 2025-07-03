<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	      	$pondID=trim($_POST['pondID']);
    	$pondCode=trim($_POST['pondCode']);
        $pondName=trim($_POST['pondName']);
        $pondSquare=trim($_POST['pondSquare']);
    



        $query1="UPDATE `pond` SET `pondCode` = '$pondCode',`pondName` = '$pondName',`pondSquare` = '$pondSquare' WHERE `pond`.`pondID` = '$pondID'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>