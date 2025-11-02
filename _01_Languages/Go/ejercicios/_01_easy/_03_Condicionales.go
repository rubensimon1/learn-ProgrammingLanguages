package main

import "fmt"

func main() {
	var nota int
	fmt.Print("Introduce tu nota: ")
	fmt.Scan(&nota)

	if nota >= 5 {
		fmt.Println("¡Aprobado!")
	} else {
		fmt.Println("Suspenso...")
	}
}
