struct Persona {
    nombre: String,
    edad: u8,
}

fn main() {
    let personas = vec![
        Persona { nombre: String::from("Ana"), edad: 25 },
        Persona { nombre: String::from("Luis"), edad: 30 },
    ];

    for p in &personas {
        println!("{} tiene {} años", p.nombre, p.edad);
    }
}
