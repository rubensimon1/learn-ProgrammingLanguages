package main

import "fmt"

type Persona struct {
	Nombre string
	Edad   int
}

func (p Persona) Presentarse() {
	fmt.Printf("Hola, soy %s y tengo %d años.\n", p.Nombre, p.Edad)
}

func main() {
	p1 := Persona{"Rubén", 21}
	p1.Presentarse()
}
