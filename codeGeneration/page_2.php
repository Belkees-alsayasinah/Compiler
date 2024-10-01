<?php
session_start();

$Title = $_GET["Title"];
$Price = $_GET["Price"];
$imageUrl = $_GET["imageUrl"];
$Description = $_GET["Description"];
$x = 300;
	
if (isset($_POST['ElevatedButton3'])) {
	

$x +=10;
$_SESSION['x']+=10;
$x=$_SESSION['x'];




}
	
if (isset($_POST['ElevatedButton4'])) {
	

$par = array("Title" => $Title, "Price" => $Price, "imageUrl" => $imageUrl, "Description" => $Description);
$parm = http_build_query($par);
		header("Location: page_3.php?$parm");
		exit;



}
echo'
<html>
		<body>
		<div class="scaffold-body">
				<div class="column">
				<div class="row" style="width:100%; display:flex ; flex-direction: row; justify-content: space-around; ">
				<div class="column">
				<p  style="color: black; font-size: 40px; ">'. $Title. '</p>
		<p  style="color: black; font-size: 30px; ">'. $Price. '</p>
		</div>
		<div class="container" style="background-color: purple; width: '. $x. 'px; height: '. $x. 'px; ">
				<img 	src="http://localhost:8000/'. $imageUrl. '" style="width: 600px; height: 400px; ">
		</div>
		</div>
		<div class="row" style="width:100%; display:flex ; flex-direction: row; justify-content: space-between; ">
				<div class="container" style="width: 200px; ">
				</div>
		<div class="column">
				<p  style="color: black; font-size: 50px; "> Description </p>
		<p  style="color: black; font-size: 20px; ">'. $Description. '</p>
		</div>
		</div>
		<form method="POST" >
				<div class="row" style="width:100%; display:flex ; flex-direction: row; justify-content: center; ">
				<button type="submit" class="ElevatedButton" name="ElevatedButton3"  style="background-color: purple; ">
				<p  style="font-size: 15px; color: white; "> Edit Information </p>
		</button>
		<div class="container" style="width: 20px; ">
				</div>
		<button type="submit" class="ElevatedButton" name="ElevatedButton4"  style="background-color: purple; ">
				<p  style="font-size: 15px; color: white; "> Edit Information </p>
		</button>
		</div>
		</form>
		</div>
		</div>

	</body>
<html>
';
?>