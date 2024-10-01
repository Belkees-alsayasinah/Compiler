<?php
session_start();

$Title = "";
$Price = "";
$imageUrl = "";
$Description = "";
$number2 = 0;
$size = 30;
$value = "";
if (isset($_POST['Title'])) {
	$Title = $_POST['Title'];
	$_SESSION['Title'] = $Title;
}
if (isset($_POST['Price'])) {
	$Price = $_POST['Price'];
	$_SESSION['Price'] = $Price;
}
if (isset($_POST['imageUrl'])) {
	$imageUrl = $_POST['imageUrl'];
	$_SESSION['imageUrl'] = $imageUrl;
}
if (isset($_POST['Description'])) {
	$Description = $_POST['Description'];
	$_SESSION['Description'] = $Description;
}
	
if (isset($_POST['ElevatedButton1'])) {
	

$par = array("Title" => $Title, "Price" => $Price, "imageUrl" => $imageUrl, "Description" => $Description);
$parm = http_build_query($par);
		header("Location: page_2.php?$parm");
		exit;



}
	
if (isset($_POST['ElevatedButton2'])) {
	

}
echo'
<html>
		<body>
		<div class="scaffold-body">
				<div class="row" style="width:100%; display:flex ; flex-direction: row; justify-content: space-evenly; align-items: center; ">
				<form method="POST" >
				<div class="column" style="height:100%; display:flex ; flex-direction: column; justify-content: space-evenly; align-items: center; ">
				<p  style="font-size: '. $size. 'px; color: purple; "> Add Products </p>
		<div class="container" style="height: 40px; ">
				</div>
		<input type="text" value="'. $Title. '" placeholder="Title" name="Title">
			<div class="container" style="height: 40px; ">
				</div>
		<input type="text" value="'. $Price. '" placeholder="Price" name="Price">
			<div class="container" style="height: 40px; ">
				</div>
		<input type="text" value="'. $imageUrl. '" placeholder="imageUrl" name="imageUrl">
			<div class="container" style="height: 40px; ">
				</div>
		<input type="text" value="'. $Description. '" placeholder="Description" name="Description">
			<div class="container" style="height: 40px; ">
				</div>
		<button type="submit" class="ElevatedButton" name="ElevatedButton1"  style="background-color: purple; ">
				<p  style="font-size: 15px; color: white; "> add item </p>
		</button>
		<button type="submit" class="ElevatedButton" name="ElevatedButton2"  style="background-color: purple; ">
				<p  style="font-size: 15px; color: white; "> add item 2 </p>
		</button>
		</div>
		</form>
		<img 	src="http://localhost:8000/'. "Tests/images/3.jpg". '" style="width: 600px; height: 300px; ">
		</div>
		</div>

	</body>
<html>
';
?>