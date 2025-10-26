from abc import ABC, abstractmethod

# --- 1. OBSERVADOR (SUSCRIPTOR) ---

class Observador(ABC):
    """Interfaz abstracta para los observadores."""
    @abstractmethod
    def actualizar(self, mensaje):
        pass

class UsuarioSuscriptor(Observador):
    """Clase concreta de un Suscriptor."""
    def __init__(self, nombre):
        self.nombre = nombre

    def actualizar(self, mensaje):
        """Implementación: el suscriptor recibe y procesa la notificación."""
        print(f"[{self.nombre}] ¡Notificación recibida! -> {mensaje}")

# --- 2. SUJETO (PUBLICADOR) ---

class CanalYouTube:
    """
    Sujeto: Mantiene una lista de observadores y los notifica de los cambios.
    """
    def __init__(self, nombre_canal):
        self.nombre_canal = nombre_canal
        self._observadores = []

    def suscribir(self, observador: Observador):
        """Añade un observador a la lista."""
        if observador not in self._observadores:
            self._observadores.append(observador)
            print(f"'{observador.nombre}' ahora está suscrito a {self.nombre_canal}.")

    def desuscribir(self, observador: Observador):
        """Elimina un observador de la lista."""
        if observador in self._observadores:
            self._observadores.remove(observador)
            print(f"'{observador.nombre}' se ha desuscrito.")

    def notificar(self, mensaje):
        """Envía la notificación a todos los observadores registrados."""
        print(f"\n--- {self.nombre_canal} está notificando a sus suscriptores ---")
        for observador in self._observadores:
            observador.actualizar(mensaje)
        print("---------------------------------------------------------------")

    def subir_video(self, titulo):
        """Simula el cambio de estado (subir video) y dispara la notificación."""
        print(f"\n[EVENTO] El canal {self.nombre_canal} acaba de subir un nuevo video: '{titulo}'")
        mensaje = f"¡Nuevo Video! Mira '{titulo}' ahora."
        self.notificar(mensaje)


# --- Zona de Pruebas ---
canal = CanalYouTube("CodeMaster Pro")

# Crear observadores
usuario_alice = UsuarioSuscriptor("Alice")
usuario_bob = UsuarioSuscriptor("Bob")
usuario_charlie = UsuarioSuscriptor("Charlie")

# Suscribir observadores
canal.suscribir(usuario_alice)
canal.suscribir(usuario_bob)
canal.suscribir(usuario_charlie)

# 1. El canal sube un video: todos son notificados.
canal.subir_video("Patrón Observer en 5 Minutos")

# Charlie se desuscribe
canal.desuscribir(usuario_charlie)

# 2. El canal sube otro video: Charlie ya no es notificado.
canal.subir_video("El Patrón Singleton Explicado")