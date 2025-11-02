use std::fs;

fn main() {
    let contenido = fs::read_to_string("data.txt")
        .expect("No se pudo leer el archivo");

    println!("Contenido:\n{}", contenido);
}
