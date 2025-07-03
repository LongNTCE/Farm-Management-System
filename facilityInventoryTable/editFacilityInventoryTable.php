<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $fitName=trim($_POST['fitName']);
        $fitID=trim($_POST['fitID']);
    


        $query="UPDATE `facility_inventory_table` SET `fInventoryTName` = '$fitName' WHERE `facility_inventory_table`.`fInventoryTID` = '$fitID'";
        
          
       

   



        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
             echo $response;




?>