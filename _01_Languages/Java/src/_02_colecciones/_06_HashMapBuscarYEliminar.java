package _01_Languages.Java.src._02_colecciones;

/*
 * 🧩 Enunciado:
 * Busca y elimina elementos en un HashMap.
 */

import java.util.HashMap;

public class _06_HashMapBuscarYEliminar {
    public static void main(String[] args) {
        HashMap<String, String> paises = new HashMap<>();

        paises.put("ES", "España");
        paises.put("FR", "Francia");
        paises.put("IT", "Italia");

        System.out.println("🌍 Mapa completo: " + paises);

        if (paises.containsKey("FR"))
            System.out.println("🔎 Francia encontrada: " + paises.get("FR"));

        paises.remove("IT");

        System.out.println("❌ Después de eliminar Italia: " + paises);
    }
}
