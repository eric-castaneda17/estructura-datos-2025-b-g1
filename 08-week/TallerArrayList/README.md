# Taller: Uso de ArrayList con Clases en Java

## Objetivo
Implementar clases en Java que representen figuras geométricas (**Círculo**, **Rectángulo** y **Triángulo**) y almacenar sus objetos en un **ArrayList**, calculando y mostrando en consola su área, perímetro e información general.

## Archivos
- `Circulo.java`
- `Rectangulo.java`
- `Triangulo.java`
- `Main.java`

## Clases implementadas
- **Circulo**
  - Atributos: `radio`, `color`
  - Métodos: `calcularArea()`, `calcularPerimetro()`, `mostrarInformacion()`

- **Rectangulo**
  - Atributos: `base`, `altura`, `color`
  - Métodos: `calcularArea()`, `calcularPerimetro()`, `mostrarInformacion()`

- **Triangulo**
  - Atributos: `lado1`, `lado2`, `lado3`, `color`
  - Métodos: `calcularArea()`, `calcularPerimetro()`, `mostrarInformacion()`

- **Main**
  - Crea un `ArrayList` de figuras.
  - Agrega al menos 2 objetos de cada tipo.
  - Recorre el `ArrayList` y muestra en consola la información de cada figura.

## Funcionamiento 

- Se implementan los métodos:
  - calcularArea() → devuelve el área de la figura.
  - calcularPerimetro() → devuelve el perímetro de la figura.
  - mostrarInformacion() → imprime los datos de la figura junto con el área y el perímetro.

- En Main se crea un ArrayList.

- Se agregan al menos dos objetos de cada tipo de figura usando el método .add().

- Con un ciclo for se recorre el ArrayList y se muestra la información de cada figura.
