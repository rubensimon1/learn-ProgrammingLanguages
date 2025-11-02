<?php
$usuario = "admin";
$password = "1234";

if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $user = $_POST["user"];
    $pass = $_POST["pass"];

    if ($user === $usuario && $pass === $password) {
        echo "Bienvenido, $user ✅";
    } else {
        echo "Credenciales incorrectas ❌";
    }
}
?>

<form method="post">
  <input type="text" name="user" placeholder="Usuario">
  <input type="password" name="pass" placeholder="Contraseña">
  <button type="submit">Entrar</button>
</form>
