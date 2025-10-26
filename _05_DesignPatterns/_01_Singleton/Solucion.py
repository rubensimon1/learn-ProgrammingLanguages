class ConfiguracionAplicacion:
    """
    Implementa el Patrón Singleton: garantiza una única instancia de la clase.
    """
    
    _instancia = None
    _inicializado = False # Bandera para controlar la inicialización

    # 1. Sobrescribimos __new__ para controlar la creación de la instancia
    def __new__(cls):
        if cls._instancia is None:
            # Si no hay instancia, la creamos llamando al new del objeto base
            cls._instancia = super(ConfiguracionAplicacion, cls).__new__(cls)
        return cls._instancia

    # 2. Sobrescribimos __init__ para controlar la inicialización de atributos
    def __init__(self):
        if not ConfiguracionAplicacion._inicializado:
            # Solo se inicializa la primera vez que se accede.
            self.config_data = {
                "version": "1.0",
                "tema": "Oscuro",
                "ruta_log": "/var/log/app.log"
            }
            ConfiguracionAplicacion._inicializado = True
            print("Singleton: Objeto de Configuración Inicializado.")
        else:
            print("Singleton: Objeto de Configuración ya existe.")

    def obtener_config(self):
        """Devuelve los datos de configuración."""
        return self.config_data

    def actualizar_tema(self, nuevo_tema):
        """Permite modificar un dato, visible en todas las referencias."""
        self.config_data["tema"] = nuevo_tema
        print(f"Configuración actualizada: Tema a '{nuevo_tema}'.")


# --- Zona de Pruebas ---
print("--- Creando las primeras referencias ---")
conf1 = ConfiguracionAplicacion()
conf2 = ConfiguracionAplicacion()

print("\n--- Verificación de Instancia Única ---")
print(f"ID de conf1: {id(conf1)}")
print(f"ID de conf2: {id(conf2)}")
# Comprueba si ambas variables apuntan al mismo objeto en memoria (debe ser True)
print(f"¿conf1 es la misma instancia que conf2? {conf1 is conf2}")

print("\n--- Prueba de Consistencia (Modificando un dato) ---")
# Modificamos el dato usando conf1
conf1.actualizar_tema("Claro")

# Leemos el dato usando conf2 para ver si se actualizó
print(f"conf1 tema: {conf1.obtener_config()['tema']}")
print(f"conf2 tema: {conf2.obtener_config()['tema']}")