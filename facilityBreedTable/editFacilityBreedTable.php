<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $fbtName=trim($_POST['fbtName']);
        $fbtID=trim($_POST['fbtID']);
    


        $query="UPDATE `facility_breed_table` SET `fBreedTName` = '$fbtName' WHERE `facility_breed_table`.`fBreedTID` = '$fbtID'";
        
          
       

   



        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
             echo $response;




?>