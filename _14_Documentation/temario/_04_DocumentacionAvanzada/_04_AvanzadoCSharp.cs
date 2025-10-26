/// <summary>
/// Clase que representa un usuario
/// </summary>
public class Usuario {
    /// <summary>Nombre del usuario</summary>
    public string Nombre { get; set; }

    /// <summary>Edad del usuario</summary>
    public int Edad { get; set; }

    /// <summary>
    /// Constructor de Usuario
    /// </summary>
    /// <param name="nombre">Nombre del usuario</param>
    /// <param name="edad">Edad del usuario</param>
    public Usuario(string nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }

    /// <summary>
    /// Devuelve la descripción del usuario
    /// </summary>
    /// <returns>String con nombre y edad</returns>
    public string Descripcion() {
        return $"{Nombre} tiene {Edad} años.";
    }
}
