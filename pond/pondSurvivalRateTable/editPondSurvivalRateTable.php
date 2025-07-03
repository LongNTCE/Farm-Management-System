<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $pstName=trim($_POST['pstName']);



        $pstID=trim($_POST['pstID']);
    


        $query="UPDATE `pond_survivalrate_table` SET `pondSurvivalRateTName` = '$pstName' WHERE `pond_survivalrate_table`.`pondSurvivalRateTID` = '$pstID'";
        
          
       

   



        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
             echo $response;




?>