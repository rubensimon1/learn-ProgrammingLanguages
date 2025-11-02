<?php
$password = "claveSecreta123";
$hash = password_hash($password, PASSWORD_BCRYPT);

echo "Hash generado: $hash<br>";

if (password_verify("claveSecreta123", $hash)) {
    echo "✅ Contraseña verificada";
} else {
    echo "❌ Contraseña incorrecta";
}
?>
