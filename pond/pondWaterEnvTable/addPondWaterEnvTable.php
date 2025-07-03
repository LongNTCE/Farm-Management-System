<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $pondID=trim($_POST['pondID']);
        $pwtName=trim($_POST['pwtName']);
    


        $query="INSERT INTO `pond_waterenv_table` (`pondID`, `pondEnvTName`) VALUES ('$pondID', '$pwtName')";
          

        $res=mysqli_query($conn,$query);
        if($res == true){
              $response = "success";}
         else{$response = "cac";}
echo $response;




?>