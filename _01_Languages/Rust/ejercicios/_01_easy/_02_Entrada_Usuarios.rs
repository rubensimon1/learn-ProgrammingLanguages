use std::io;

fn main() {
    println!("¿Cómo te llamas?");
    let mut nombre = String::new();

    io::stdin()
        .read_line(&mut nombre)
        .expect("Error al leer la entrada");

    println!("Encantado, {}!", nombre.trim());
}
