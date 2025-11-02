<?php
$pdo = new PDO("mysql:host=localhost;dbname=tienda", "root", "");

if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $nombre = $_POST["nombre"];
    $precio = $_POST["precio"];
    $pdo->prepare("INSERT INTO productos (nombre, precio) VALUES (?, ?)")
        ->execute([$nombre, $precio]);
}

echo "<h2>Lista de productos</h2>";
foreach ($pdo->query("SELECT * FROM productos") as $p) {
    echo "{$p['nombre']} — {$p['precio']} €<br>";
}
?>
<form method="post">
  <input type="text" name="nombre" placeholder="Nombre del producto" required>
  <input type="number" step="0.01" name="precio" placeholder="Precio" required>
  <button type="submit">Agregar</button>
</form>
