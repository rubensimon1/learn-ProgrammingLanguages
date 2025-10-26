/**
 * Clase de usuario
 * @class
 * @author ChatGPT
 * @version 1.0
 */
class Usuario {
    /**
     * Crea un usuario
     * @param {string} nombre Nombre del usuario
     * @param {number} edad Edad del usuario
     */
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Devuelve la descripción del usuario
     * @returns {string} Nombre y edad del usuario
     */
    descripcion() {
        return `${this.nombre} tiene ${this.edad} años.`;
    }
}
