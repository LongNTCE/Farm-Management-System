<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $pwtName=trim($_POST['pwtName']);



        $pwtID=trim($_POST['pwtID']);
    


        $query="UPDATE `pond_waterenv_table` SET `pondEnvTName` = '$pwtName' WHERE `pond_waterenv_table`.`pondWaterEnvTID` = '$pwtID'";
        
          
       

   



        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
             echo $response;




?>