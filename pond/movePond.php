<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $cropID=trim($_POST['cropID']);
        $pondID=trim($_POST['pondID']);
        

    


        $query1="UPDATE `crop - pond` SET `cropID` = '$cropID' WHERE `crop - pond`.`pondID` = '$pondID'";
          
       
   



        $res=mysqli_query($conn,$query1);

        if($res == true){
              $response = "succeed";}
         else{$response = "failed";}
echo $response;




?>