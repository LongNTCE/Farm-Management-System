<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $pitName=trim($_POST['pitName']);



        $pitID=trim($_POST['pitID']);
    


        $query="UPDATE `pond_inventory_table` SET `pondInventoryTName` = '$pitName' WHERE `pond_inventory_table`.`pondInventoryTID` = '$pitID'";
        
          
       

   



        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
             echo $response;




?>