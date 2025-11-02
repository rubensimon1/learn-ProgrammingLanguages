use std::thread;
use std::time::Duration;

fn main() {
    let handle = thread::spawn(|| {
        for i in 1..=5 {
            println!("Hilo secundario: iteración {}", i);
            thread::sleep(Duration::from_millis(500));
        }
    });

    for i in 1..=3 {
        println!("Hilo principal: iteración {}", i);
        thread::sleep(Duration::from_millis(700));
    }

    handle.join().unwrap();
}
