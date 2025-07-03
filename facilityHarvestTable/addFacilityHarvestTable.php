<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $cropID=trim($_POST['cropID']);
        $fhtName=trim($_POST['fhtName']);
    


        $query="INSERT INTO `facility_harvest_table` (`cropID`, `fHarvestTName`) VALUES ('$cropID', '$fhtName')";
          
       

   



        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
echo $response;




?>