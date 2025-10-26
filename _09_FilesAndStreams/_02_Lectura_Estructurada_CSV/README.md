# Ejercicio 2: Procesamiento de Datos Estructurados (CSV)

## 🎯 Objetivo
Aprender a procesar un formato de datos estructurado (valores separados por comas, CSV) para convertirlo en una **estructura de datos útil en memoria** (generalmente una lista de diccionarios/mapas).

## 📝 Instrucciones (Lógica Universal)
1.  **Datos de Entrada:** Simula los datos de un CSV (varias líneas, separadas por coma).
    * La **primera línea** siempre es la cabecera (nombres de las columnas/claves).

2.  Crea una función llamada `procesar_csv_a_mapas`.
3.  La función debe:
    * Dividir los datos brutos por el carácter de **salto de línea**.
    * Separar la primera línea para obtener los **nombres de las columnas**.
    * Iterar sobre el resto de las líneas (los datos).
    * En cada línea de datos, dividirla por el **delimitador** (la coma `,`).
    * Crear un **Mapa (Diccionario)** para cada fila, asociando cada **valor** con su **clave** correspondiente de la cabecera.
4.  La función debe devolver una **Lista de Mapas**.

## 🔑 Conceptos Clave
* **Estructuración:** Los datos brutos (`string`) deben convertirse en objetos que el programa pueda manipular fácilmente (`Listas de Mapas`).
* **Delimitador:** El carácter que separa los valores (la coma en CSV).
* **Header (Cabecera):** La metainformación de la primera fila que define el significado de cada columna.

## ✅ Lógica Universal Esperada

DATOS_CSV_BRUTOS = "ID,Nombre,Edad\n1,Alice,30\n2,Bob,24"

FUNCION procesar_csv_a_mapas(datos_csv): Lineas = datos_csv.DividirPor(SaltoDeLinea)

SI Lineas ESTA VACIO:
    DEVOLVER Lista Vacia

// 1. Obtener la Cabecera (claves)
Cabecera = Lineas[0].DividirPor(Coma)

ListaDeMapas = Crear Nueva Lista

// 2. Iterar sobre las líneas de Datos
PARA CADA linea_datos EN Lineas (EXCLUYENDO la primera):
    Valores = linea_datos.DividirPor(Coma)
    
    FilaMapa = Crear Nuevo Mapa Vacio
    
    // 3. Emparejar Clave-Valor
    PARA i DESDE 0 HASTA longitud(Valores) - 1:
        CLAVE = Cabecera[i]
        VALOR = Valores[i]
        FilaMapa[CLAVE] = VALOR
        
    Añadir FilaMapa a ListaDeMapas
    
DEVOLVER ListaDeMapas