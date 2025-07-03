<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

	$pondInventoryTID =trim($_POST['pondInventoryTID']);

 
 $query1="DELETE FROM `pond_inventory_record` WHERE pondInventoryTID ='$pondInventoryTID'";
 $query2="DELETE FROM `pond_inventory_table` WHERE pondInventoryTID ='$pondInventoryTID'";
 
        $res=mysqli_query($conn,$query1);
        $res2=mysqli_query($conn,$query2);
        if($res2==true)
        $response="deleted";
        else
        $response="failed";

    echo $response;

	


?>