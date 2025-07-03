<?php
$conn=mysqli_connect("sql180.main-hosting.eu","u188051294_Lamdeptrai","Lam@cuto2022");
mysqli_select_db($conn,"apidb_test1");

    $name=trim($_POST['name']);
    $email=trim($_POST['email']);
    $password=trim($_POST['password']);

    $query="select * from user where email='$email'";
    $raw=mysqli_query($conn,$query);
    $count=mysqli_num_rows($raw);

    if($count>0)
    {
        $response="exist";
    }
    else
    {
        $query1="INSERT INTO `user` (`id`, `name`, `email`, `password`) 
        VALUES (NULL, '$name', '$email', '$password');";
        $res=mysqli_query($conn,$query1);
        if($res==true)
        $response="inserted";
        else
        $response="failed";
    }

    echo $response;

?>