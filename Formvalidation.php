<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Validation</title>
    <style>
        #form_data{display: flex;border:solid;border-radius: 2px;border-color: red;padding:20px;margin:inherit;flex-wrap: wrap;flex-direction: column;}
        span{color: red;}
    </style>
</head>
<h1 style="color:green;">Form Validation</h1>
<body>
    <div id="form_data">
    <form method="POST" action="">
            <div style="color:brown">Email<input type="text" value="" name="email" required></div>
           <div style="padding-top:2px;margin-top:14px;color:aqua">Name<input type="text" value="" name="username" style="margin: top 14px;"></div><br>
            <div>Phone<input type="number" value="" name="phone"required></div>
            <br>
            <input type="submit" name="submit"style = "margin-top:10px">
    </form>
    </div>
    <?php
    $email = $name = $phone = "";
    $flag = 0;
    $pattern = "^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$^";
    $pattern2 = "^[a-z]^";  
    if($_SERVER["REQUEST_METHOD"]== "POST"){
        $email = $_POST["email"];
        $name= date($_POST["username"]);
        $phone = date($_POST["phone"]);
        if(!preg_match($pattern,$email)){
            echo "<span>Invalid Email</span>";
            $email = "";
        }elseif(strlen($phone) and (strlen($phone)<10 or strlen($phone) > 10)){
            $phone ="";
            echo "<span>Invalid phone number</span>";
        }
        else{
            if($email !="" and $name !="" and $phone!=""){
                createDb($email,$phone,$name);
            }
        }
    }
    function data($data){
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;
    }
    function createDb($email,$phone,$name){
        $user = "root";
        $server = "localhost";
        $pass = "";
        $conn = mysqli_connect($server,$user,$pass,'users');
        if(!$conn){
            echo "error";
            die("error");
        }
        else{
            $use_db = "USE `users`";
            $insert_db = "INSERT INTO `info` VALUES('$email','$name','$phone')";
            $conn->query($use_db);
            if($conn->query($insert_db)){
                echo "Inserted SuccessFully";
            }
        }
    }
    ?>
</body>
</html>