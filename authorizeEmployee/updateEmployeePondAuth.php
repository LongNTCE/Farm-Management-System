<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

		$employeeID=trim($_POST['employeeID']);
        $pondID=trim($_POST['pondID']);
        $allowWaterRecord=trim($_POST['allowWaterRecord']);
        $allowSurvivalRecord=trim($_POST['allowSurvivalRecord']);
        $allowInventoryRecord=trim($_POST['allowInventoryRecord']);

    
        $query1 = "UPDATE pond_employee_authorization SET allowInventoryRecord = $allowInventoryRecord, allowSurvivalRecord = $allowSurvivalRecord, allowWaterRecord = $allowWaterRecord WHERE pond_employee_authorization.`employeeID` = $employeeID AND pond_employee_authorization.`pondID`= $pondID;";

        
		$res=mysqli_query($conn,$query1);
		
        if($res == true){
              $response = "succeed pea";}
         else{$response = "failed pea";}
echo $response;




?>