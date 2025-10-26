# --- 1. TARGET (La interfaz que queremos usar) ---
class SistemaNotificacion:
    """
    La interfaz deseada. Todas las clases que hereden de Target deben
    implementar este método.
    """
    def enviar_mensaje(self, texto):
        raise NotImplementedError("Subclase debe implementar el método abstracto.")

# --- 2. ADAPTEE (La clase incompatible) ---
class NotificacionAntigua:
    """
    Clase antigua que tiene una interfaz diferente (lanzar_alerta).
    No podemos cambiar su código fuente.
    """
    def lanzar_alerta(self, alerta):
        print(f"[Sistema Antiguo] Alerta disparada: {alerta.upper()}")

# --- 3. ADAPTER (La clase que traduce) ---
class AdaptadorNotificacionAntigua(SistemaNotificacion):
    """
    Adapta la interfaz de NotificacionAntigua a la interfaz de SistemaNotificacion.
    """
    
    def __init__(self, notificador_antiguo):
        # Composición: El adaptador contiene una referencia al objeto incompatible
        self.notificador_antiguo = notificador_antiguo

    def enviar_mensaje(self, texto):
        """
        Implementa el método TARGET y traduce la llamada al ADAPTEE.
        """
        print("[Adaptador] Traduciendo 'enviar_mensaje' a 'lanzar_alerta'...")
        # Llama al método incompatible del objeto Adaptee
        self.notificador_antiguo.lanzar_alerta(texto)


# --- Zona de Pruebas ---

# Clase moderna (que ya cumple con el Target) para comparación
class NotificacionModerna(SistemaNotificacion):
    def enviar_mensaje(self, texto):
        print(f"[Sistema Moderno] Enviando mensaje de texto: {texto}")


print("--- USANDO EL ADAPTADOR ---")
sistema_antiguo_incompatible = NotificacionAntigua()

# Creamos el adaptador y le pasamos el sistema antiguo
adaptador = AdaptadorNotificacionAntigua(sistema_antiguo_incompatible)

# Llamamos al método unificado (Target) a través del adaptador
adaptador.enviar_mensaje("Prueba de integración exitosa con el Adaptador")

print("\n--- USANDO EL SISTEMA MODERNO (Target Directo) ---")
moderno = NotificacionModerna()
moderno.enviar_mensaje("Mensaje directo, sin necesidad de adaptador.")