# ⏱️ Complejidad Algorítmica (Notación Big O)

## ¿Qué es esto?

La **Complejidad Algorítmica** es la forma en que medimos qué tan **rápido** (y qué tanta memoria usa) un programa a medida que la cantidad de datos que procesa **crece**.

No medimos el tiempo en segundos, sino el **número de pasos** que el algoritmo necesita. A esto se le llama **Notación Big O ($\mathcal{O}$)**.

Piensa en la Big O como una **promesa** o una **garantía** de que tu código no se volverá *demasiado lento* cuando los datos pasen de ser 10 a ser 10 millones.

## 📈 Tipos de Complejidad (De Mejor a Peor)

| Notación | Nombre | Significado simple | Ejemplo | ¿Es bueno? |
| :---: | :---: | :--- | :--- | :---: |
| $\mathcal{O}(1)$ | **Constante** | El tiempo siempre es el mismo, no importa cuántos datos haya. | Acceder a un elemento por su índice en una lista. | **¡Excelente!** |
| $\mathcal{O}(\log n)$ | **Logarítmica** | El tiempo crece muy lentamente. Eliminas grandes partes de datos en cada paso. | Búsqueda Binaria. | **Muy bueno** |
| $\mathcal{O}(n)$ | **Lineal** | El tiempo crece proporcionalmente a los datos. Si hay el doble de datos, tarda el doble. | Recorrer una lista para buscar algo. | **Aceptable** |
| $\mathcal{O}(n \log n)$ | **Log-Lineal** | Un poco más lento que lineal, común en algoritmos de ordenación eficientes. | Algoritmos Quick Sort o Merge Sort. | **Bueno** |
| $\mathcal{O}(n^2)$ | **Cuadrática** | El tiempo crece muy rápido (al cuadrado). Típico de dos bucles anidados. | Algoritmo Bubble Sort. | **Lento** |
| $\mathcal{O}(2^n)$ | **Exponencial** | ¡El tiempo explota! Solo sirve para entradas muy pequeñas. | Problemas de fuerza bruta. | **Terrible** |



## ✍️ Tarea

Revisa el archivo `EJEMPLOS.md` en esta carpeta para ver el código que genera cada tipo de complejidad y trata de entender por qué.