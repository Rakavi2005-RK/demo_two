<?php
$servername="localhost";
$username="root";
$password="";
$dbname="db";
$conn=new mysqli($servername,$username,$password,$dbname);
if($conn->connect_error)
{
    die("connnection failed". $conn->connect_error);
}

if($_SERVER["REQUEST_METHOD"]==="POST")
{
    $name=$_POST[name];
    $phonenumber=$_POST[phonenumber];
    $relation=$_POST[relations]; 
    $address=$_POST[address];
    $aadhar=$_POST[aadhar];

    $allowedformat=['png','jpg','jpeg','pdf'];
    $filename=$_FILES[docu][name];
    $filetmpname=$_FILES[docu][tmp_name];
    $extractextension=explode(".",$filename);
    $extension=strtolower(end($extractextension));
    if(!in_array($extension,$allowedformat))
    {
        die("file is in invalid format");
    }
    $filecontent=file_get_contents($filetmpname);
    $stmt=$conn->prepare("INSERT INTO db (username,phonenumber,relation,Aaddress,aadhar,filecontent) VALUES(?,?,?,?,?,?)");
    $stmt->bind_param("sssssb",$name,$phonenumber,$relation,$address,$aadhar,$filecontent);

    if($stmt->execute())
    {
        echo("data successfully inserted");
    }
    else
    {
        echo "error".$stmt->error;
    }
    $stmt->close();
}
    $conn->close();
?>