package main

import (
	"fmt"
	"time"
)

func decir(mensaje string) {
	for i := 0; i < 3; i++ {
		fmt.Println(mensaje)
		time.Sleep(time.Millisecond * 500)
	}
}

func main() {
	go decir("Hola")
	decir("Mundo")
}
