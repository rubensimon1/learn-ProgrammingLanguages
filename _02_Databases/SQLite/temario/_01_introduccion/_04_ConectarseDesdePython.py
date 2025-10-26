import sqlite3

# Conexión (crea el archivo si no existe)

conn = sqlite3.connect("tienda.db")
cursor = conn.cursor()

cursor.execute("""
CREATE TABLE IF NOT EXISTS productos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT,
    precio REAL
)
""")

print("Conexión y tabla creadas correctamente.")
conn.close()
