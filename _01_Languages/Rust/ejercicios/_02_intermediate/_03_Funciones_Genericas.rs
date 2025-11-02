fn mayor<T: PartialOrd + Copy>(a: T, b: T) -> T {
    if a > b { a } else { b }
}

fn main() {
    println!("Mayor entre 5 y 10: {}", mayor(5, 10));
    println!("Mayor entre 3.2 y 1.8: {}", mayor(3.2, 1.8));
}
