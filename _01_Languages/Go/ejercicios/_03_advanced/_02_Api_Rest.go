package main

import (
	"encoding/json"
	"net/http"
)

type Mensaje struct {
	Texto string `json:"texto"`
}

func handler(w http.ResponseWriter, r *http.Request) {
	msg := Mensaje{Texto: "¡Hola desde una API en Go!"}
	json.NewEncoder(w).Encode(msg)
}

func main() {
	http.HandleFunc("/saludo", handler)
	http.ListenAndServe(":8080", nil)
}
