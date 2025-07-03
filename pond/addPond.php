<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

        $cropID=trim($_POST['cropID']);
        $pondCode=trim($_POST['pondCode']);
        $pondName=trim($_POST['pondName']);
        $pondSquare=trim($_POST['pondSquare']);

    


        $query1="INSERT INTO `pond`(`pondCode`, `pondName`, `pondSquare`) VALUES ('$pondCode', '$pondName', '$pondSquare')";
          

                             
        $query2="INSERT INTO `crop - pond` (`cropID`, `pondID`) VALUES ('$cropID', LAST_INSERT_ID());";
       

   



        $res=mysqli_query($conn,$query1);
        $re2=mysqli_query($conn,$query2);
        if($re2 == true){
              $response = "succeed";}
         else{$response = "failed";}
echo $response;




?>