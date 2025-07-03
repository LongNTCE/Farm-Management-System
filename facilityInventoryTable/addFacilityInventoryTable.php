<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $cropID=trim($_POST['cropID']);
        $fitName=trim($_POST['fitName']);
    


        $query="INSERT INTO `facility_inventory_table` (`cropID`, `fInventoryTName`) VALUES ('$cropID', '$fitName')";
          
       

   



        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
echo $response;




?>