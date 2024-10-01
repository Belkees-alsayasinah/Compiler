<?php
session_start();

$Title = $_GET["Title"];
$Price = $_GET["Price"];
$imageUrl = $_GET["imageUrl"];
$Description = $_GET["Description"];
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
	
if (isset($_POST['ElevatedButton5'])) {
	

$par = array("Title" => $Title, "Price" => $Price, "imageUrl" => $imageUrl, "Description" => $Description);
$parm = http_build_query($par);
		header("Location: page_2.php?$parm");
		exit;



}
echo'
<html>
		<body>
		<div class="scaffold-body">
				<form method="POST" >
				<div class="row">
				<div class="column">
				<p  style="font-size: 25px; "> Title: </p>
		<input type="text" value="'. $Title. '" placeholder="Title" name="Title">
			<div class="container" style="height: 20px; ">
				</div>
		<p  style="font-size: 25px; "> Price: </p>
		<input type="text" value="'. $Price. '" placeholder="Price" name="Price">
			<div class="container" style="height: 20px; ">
				</div>
		<p  style="font-size: 25px; "> imageUrl: </p>
		<input type="text" value="'. $imageUrl. '" placeholder="imageUrl" name="imageUrl">
			<div class="container" style="height: 20px; ">
				</div>
		<p  style="font-size: 25px; "> Description: </p>
		<input type="text" value="'. $Description. '" placeholder="Description" name="Description">
			<div class="container" style="height: 20px; ">
				</div>
		<button type="submit" class="ElevatedButton" name="ElevatedButton5" >
				<p > Done </p>
		</button>
		</div>
		<img 	src="http://localhost:8000/'. "Tests/images/3.jpg". '" style="width: 600px; height: 300px; ">
		</div>
		</form>
		</div>

	</body>
<html>
';
?>