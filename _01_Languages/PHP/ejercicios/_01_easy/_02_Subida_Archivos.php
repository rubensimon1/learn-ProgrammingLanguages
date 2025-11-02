<?php
if ($_SERVER["REQUEST_METHOD"] === "POST" && isset($_FILES["archivo"])) {
    $archivo = $_FILES["archivo"];
    $destino = "uploads/" . basename($archivo["name"]);

    if (move_uploaded_file($archivo["tmp_name"], $destino)) {
        echo "Archivo subido correctamente: " . htmlspecialchars($archivo["name"]);
    } else {
        echo "Error al subir el archivo ❌";
    }
}
?>

<form method="post" enctype="multipart/form-data">
  <input type="file" name="archivo" required>
  <button type="submit">Subir archivo</button>
</form>
