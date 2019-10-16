<?php
//Taking value from HTML form
$name=$_POST["name"];
$phone=$_POST["phone"];
$address=$_POST["address"];

//Variables for Database;

$host="127.0.0.1";
$db="msc";
$user="root";
$password="";

//Database Object

$conn= mysqli_connect($host, $user, $password, $db);
//Checking Connection
if(!$conn){
    die("Connection Terminted"+mysqli_error($conn));
}
//Insert Query
$sqlInsertQuery="INSERT INTO `data` (`id`, `Name`, `Phone`, `Address`) VALUES (NULL, '" .$name."' , '" .$phone."' , '".$address."')";
//$sqlInsertQuery="INSERT INTO `data` (`id`, `Name`, `Phone`, `Address`) VALUES (NULL, 'Kshitij', '9725880466', 'Vadodara')";
//Executing Insert Query
if(mysqli_query($conn, $sqlInsertQuery)){
    echo "<h1><marquee> Data Added </marquee></h1>";
}else{
    echo "<marquee>ERROR PROCESING YOUR REQUEST</marquee>";
}
//Display Query
$sqlSelectQuery="SELECT * FROM data";
//Executing  SQL Query
$result= mysqli_query($conn, $sqlSelectQuery);

//Displaying Result
$display="<table border='1'><tr><th>ID</th><th>Name</th><th>Phone</th><th>Address</th></tr>";

while($row= mysqli_fetch_array($result)){
    $display.="<tr><td>".$row['id']."</td> <td>".$row['Name']."</td><td>".$row['Phone']."</td><td>".$row['Address']."</td>";
}
$display.="</table>";
 echo $display;
 
 //PHP STRING FUNCTIONS
 
 echo "<h1><b><i>\"People will hurt you and act like you hurt them . -Kshitij\"</i></b></h1>";
$demoString="People will hurt you and act like you hurt them . -Kshitij";
echo "<h2><b><u>String functions</u></h2>";
echo "1. strlen: return Length of String:  " .strlen($demoString);
echo "<br>2. str_word_count: return words in String:  " .str_word_count($demoString);
echo "<br>3. strrev: return reverse of String:  " .strrev($demoString);
echo "<br>4. strpos(string,find): return position of String for word Kshitij:  " .strpos($demoString,"Kshitij");
echo "<br>5. str_replace(kisko,kisse,string): replace word in String " .str_replace("Kshitij","Bhatnagar",$demoString);
echo "<br>6. stripos: return position of String in sensitive:  " .stripos($demoString,"Kshitij");
echo "<br>7. strrpos: return last position of String:  " .strrpos($demoString,"Kshitij");
echo "<br>8. strripos: return last position of String insensitive:  " .strripos($demoString,"Kshitij");
echo "<br>9. strtolower: return reverse of String:  " .strtolower($demoString);
echo "<br>10. strtoupper: return reverse of String:  " .strtoupper($demoString);
echo "<br>11. trim: return reverse of String:  " .trim($demoString);

echo "<h2><b><u>Arrayfunctions</u></b></h2>";
$Friends=array("Kshtij","Harsh","Parth","Joy");
for($i=0;$i<count($Friends);$i++){
    echo "<br>Hello ".$Friends[$i];
}
