<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	
    $faInventoryID=trim($_POST['faInventoryID']);
    	$productName=trim($_POST['productName']);
    	$importDate=trim($_POST['importDate']);
    	$quantity=trim($_POST['quantity']);
        $sourceName=trim($_POST['sourceName']);
        $manurfacturingDate=trim($_POST['manurfacturingDate']);
        $expireDate=trim($_POST['expireDate']);

	

        $query1="UPDATE `facility_inventory_record` SET `productName` = '$productName',`importDate` = '$importDate',`quantity` = '$quantity',`sourceName` = '$sourceName',`manurfacturingDate` = '$manurfacturingDate',`expireDate` = '$expireDate' WHERE `facility_inventory_record`.`faInventoryID` = '$faInventoryID'";

        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";

    echo $response;

?>