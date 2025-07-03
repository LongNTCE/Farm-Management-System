<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"apidb_test1");

    $name=trim($_POST['name']);
    $email=trim($_POST['email']);
    $password=trim($_POST['password']);

    $query="select * from user where email='$email' and password ='$password'";
    $raw=mysqli_query($conn,$query);
    $count=mysqli_num_rows($raw);

    if($count>0)
    {
        $response="success";
    }
    else
    {
        $response="failure";
    }

    echo $response;

?>