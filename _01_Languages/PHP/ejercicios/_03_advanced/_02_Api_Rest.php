<?php
header("Content-Type: application/json");
$pdo = new PDO("mysql:host=localhost;dbname=tienda", "root", "");

$productos = $pdo->query("SELECT * FROM productos")->fetchAll(PDO::FETCH_ASSOC);
echo json_encode($productos);
?>
