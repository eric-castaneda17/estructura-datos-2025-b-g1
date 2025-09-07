# Sistema de Gestión de Biblioteca – Unidad 1
## Descripción corta
Este sistema simula la gestión de una biblioteca en Java.
Permite registrar libros, eliminarlos lógicamente, buscar por título, gestionar préstamos y devoluciones, y mantener un historial de operaciones.

## El programa implementa estructuras clásicas de la Unidad 1:
- Arrays
- Listas enlazadas simples
- Listas doblemente enlazadas
- Programación estructurada (secuencia, selección e iteración)

## Razones de elección de estructuras 
### Arrays (catalogo[] y disponibilidad[][])
- Se usan porque el catálogo tiene un tamaño máximo definido.
- Son fáciles de manejar y permiten guardar todos los libros en orden.
- También permiten relacionar un libro con el stock disponible en cada sucursal usando una matriz.

### Lista enlazada simple (prestamosActivos)
- Se usa porque los préstamos cambian mucho (se agregan y se eliminan).
- Con esta estructura es más fácil administrar la lista de préstamos activos

## Lista doblemente enlazada (historial)
- Se usa para almacenar el historial de operaciones (altas, bajas, préstamos, devoluciones).
- Permite recorrer hacia adelante y hacia atrás, útil para mostrar el historial en ambos sentidos.
