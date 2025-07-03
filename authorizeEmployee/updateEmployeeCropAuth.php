<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"u188051294_grad_project");

		$employeeID=trim($_POST['employeeID']);
        $cropID=trim($_POST['cropID']);
        $allowBreedRecord=trim($_POST['allowBreedRecord']);
        $allowHarvestRecord=trim($_POST['allowHarvestRecord']);
        $allowInventoryRecord=trim($_POST['allowInventoryRecord']);

    
        $query1 = "UPDATE crop_employee_authorization SET allowBreedRecord = $allowBreedRecord, allowHarvestRecord = $allowHarvestRecord, allowInventoryRecord = $allowInventoryRecord WHERE crop_employee_authorization.`employeeID` = $employeeID AND crop_employee_authorization.`cropID`= $cropID;";

        
		$res=mysqli_query($conn,$query1);
		
        if($res == true){
              $response = "succeed cea";}
         else{$response = "failed cea";}
echo $response




?>