package main

import (
	"fmt"
	"time"
)

func tarea(nombre string, duracion time.Duration, ch chan string) {
	time.Sleep(duracion)
	ch <- fmt.Sprintf("%s completada", nombre)
}

func main() {
	ch := make(chan string)

	go tarea("Descarga", 2*time.Second, ch)
	go tarea("Procesamiento", 3*time.Second, ch)
	go tarea("Subida", 1*time.Second, ch)

	for i := 0; i < 3; i++ {
		fmt.Println(<-ch)
	}

	fmt.Println("🚀 Todas las tareas completadas.")
}
