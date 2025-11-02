package main

import "fmt"

func sumar(a int, b int) int {
	return a + b
}

func main() {
	resultado := sumar(5, 7)
	fmt.Println("La suma es:", resultado)
}
