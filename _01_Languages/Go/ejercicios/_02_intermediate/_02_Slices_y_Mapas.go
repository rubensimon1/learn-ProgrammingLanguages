package main

import "fmt"

func main() {
	frutas := []string{"manzana", "pera", "naranja"}
	frutas = append(frutas, "uva")

	for i, fruta := range frutas {
		fmt.Println(i, fruta)
	}

	edades := map[string]int{"Ana": 25, "Luis": 30}
	edades["Marta"] = 28

	fmt.Println("Edades:", edades)
}
