<?php
echo "¡Hola, mundo desde PHP! 🐘";
?>
<?php
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $nombre = htmlspecialchars($_POST["nombre"]);
    $email = filter_var($_POST["email"], FILTER_SANITIZE_EMAIL);
    $mensaje = htmlspecialchars($_POST["mensaje"]);

    if ($nombre && $email && $mensaje) {
        echo "<p>Gracias, $nombre. Tu mensaje ha sido enviado ✅</p>";
    } else {
        echo "<p>Error: completa todos los campos ⚠️</p>";
    }
}
?>

<form method="post" action="">
  <input type="text" name="nombre" placeholder="Tu nombre">
  <input type="email" name="email" placeholder="Tu correo">
  <textarea name="mensaje" placeholder="Tu mensaje"></textarea>
  <button type="submit">Enviar</button>
</form>
