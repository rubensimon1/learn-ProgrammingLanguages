use serde::{Serialize, Deserialize};

#[derive(Serialize, Deserialize)]
struct Usuario {
    id: u32,
    nombre: String,
}

fn main() {
    let usuarios = vec![
        Usuario { id: 1, nombre: String::from("Ruben") },
        Usuario { id: 2, nombre: String::from("Ana") },
    ];

    let json = serde_json::to_string_pretty(&usuarios).unwrap();
    println!("{}", json);
}
