<?php
$usuarios = [
    ["nombre" => "Ana", "rol" => "Admin"],
    ["nombre" => "Luis", "rol" => "Editor"],
    ["nombre" => "Marta", "rol" => "Viewer"]
];

echo "<ul>";
foreach ($usuarios as $u) {
    echo "<li>{$u['nombre']} — {$u['rol']}</li>";
}
echo "</ul>";
?>
