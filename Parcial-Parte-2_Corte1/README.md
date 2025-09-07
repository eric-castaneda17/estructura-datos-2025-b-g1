# Sistema de Gestión de Biblioteca – Unidad 1
## Descripción corta
Este sistema simula la gestión de una biblioteca en Java.
Permite registrar libros, eliminarlos lógicamente, buscar por título, gestionar préstamos y devoluciones, y mantener un historial de operaciones.

## El programa implementa estructuras clásicas de la Unidad 1:
- Arrays
- Listas enlazadas simples
- Listas doblemente enlazadas
- Programación estructurada (secuencia, selección e iteración)

## Razones de elección de estructuras y complejidad
### Arrays (catalogo[] y disponibilidad[][])
- Se eligieron porque el catálogo de libros tiene un tamaño fijo (MAX_LIBROS).
- El acceso por índice es de complejidad O(1), muy eficiente.
- La búsqueda de un libro se realiza con búsqueda lineal, complejidad O(n), aceptable para catálogos pequeños.

### Lista enlazada simple (prestamosActivos)
- Se utiliza para manejar los préstamos activos, que cambian dinámicamente.
- Insertar un préstamo al inicio de la lista tiene complejidad O(1).
- Eliminar un préstamo (cuando se devuelve un libro) requiere recorrer la lista, complejidad O(n).
- Se eligió lista simple porque solo es necesario recorrer hacia adelante.

## Lista doblemente enlazada (historial)
- Se usa para almacenar el historial de operaciones (altas, bajas, préstamos, devoluciones).
- Permite recorrer hacia adelante y hacia atrás, útil para mostrar el historial en ambos sentidos.
