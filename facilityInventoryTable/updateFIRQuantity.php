<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	    $fInventoryTID=trim($_POST['fInventoryTID']);
    	$productName=trim($_POST['productName']);
    	$importDate=trim($_POST['importDate']);
    	$quantity=trim($_POST['quantity']);
        $sourceName=trim($_POST['sourceName']);
        $manurfacturingDate=trim($_POST['manurfacturingDate']);
        $expireDate=trim($_POST['expireDate']);
        $productCode=trim($_POST['productCode']);


	


        $query1="UPDATE `facility_inventory_record` SET `productName` = '$productName',`importDate` = '$importDate',`quantity` = '$quantity',`sourceName` = '$sourceName',`manurfacturingDate` = '$manurfacturingDate',`expireDate` = '$expireDate',`productCode` = '$productCode' WHERE `facility_inventory_record`.`productName` = '$productName'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="success";
        else
        $response="failed";

    echo $response;

?>