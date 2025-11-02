<?php
session_start();

if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $user = $_POST["user"];
    $pass = $_POST["pass"];

    if ($user === "admin" && $pass === "php123") {
        $_SESSION["usuario"] = $user;
        header("Location: dashboard.php");
        exit;
    } else {
        echo "Usuario o contraseña incorrectos ❌";
    }
}
?>

<form method="post">
  <input type="text" name="user" placeholder="Usuario">
  <input type="password" name="pass" placeholder="Contraseña">
  <button type="submit">Iniciar sesión</button>
</form>
