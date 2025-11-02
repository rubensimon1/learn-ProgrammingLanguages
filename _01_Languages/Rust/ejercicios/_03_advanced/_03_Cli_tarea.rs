use std::fs::{self, OpenOptions};
use std::io::{self, Write};

fn main() {
    println!("1️⃣ Ver tareas\n2️⃣ Agregar tarea");
    let mut opcion = String::new();
    io::stdin().read_line(&mut opcion).unwrap();

    match opcion.trim() {
        "1" => listar_tareas(),
        "2" => agregar_tarea(),
        _ => println!("Opción no válida"),
    }
}

fn listar_tareas() {
    let data = fs::read_to_string("tareas.txt").unwrap_or_default();
    println!("📋 Tareas:\n{}", data);
}

fn agregar_tarea() {
    println!("Escribe la nueva tarea:");
    let mut tarea = String::new();
    io::stdin().read_line(&mut tarea).unwrap();

    let mut file = OpenOptions::new().append(true).create(true).open("tareas.txt").unwrap();
    writeln!(file, "{}", tarea.trim()).unwrap();

    println!("✅ Tarea guardada.");
}
