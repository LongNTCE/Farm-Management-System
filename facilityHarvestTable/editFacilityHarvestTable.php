<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $fhtName=trim($_POST['fhtName']);
        $fhtID=trim($_POST['fhtID']);
    


        $query="UPDATE `facility_harvest_table` SET `fHarvestTName` = '$fhtName' WHERE `facility_harvest_table`.`fHarvestTID` = '$fhtID'";
        
          
       

   



        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
             echo $response;




?>