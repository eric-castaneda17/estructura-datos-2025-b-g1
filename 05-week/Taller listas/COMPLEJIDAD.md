# Complejidad de operaciones en listas

A continuación se presenta la complejidad de las operaciones implementadas en listas simples, dobles y circulares.


## Tabla de complejidad

| Operación            | Lista simple | Lista doble | Lista circular |
|----------------------|--------------|-------------|----------------|
| Insertar inicio      | O(1)         | O(1)        | O(1)           |
| Insertar fin         | O(n)         | O(1) si hay puntero al último | O(n) |
| Insertar posición    | O(n)         | O(n)        | O(n)           |
| Eliminar inicio      | O(1)         | O(1)        | O(1)           |
| Eliminar fin         | O(n)         | O(1) si hay puntero al último | O(n) |
| Eliminar posición    | O(n)         | O(n)        | O(n)           |
| Mostrar lista        | O(n)         | O(n)        | O(n)           |


##  Análisis

- **Lista simple**: operaciones al inicio son O(1), pero recorrer hasta el final o una posición intermedia es O(n).  
- **Lista doble**: tener referencia a `cola` permite insertar y eliminar al final en O(1).  
- **Lista circular**: las operaciones son similares a la lista simple, pero la estructura conecta el último con el primero, lo que permite recorrer en ciclos.  


##  Conclusión

La elección de la estructura depende del problema:  
- **Lista simple**: útil para inserciones rápidas al inicio.  
- **Lista doble**: eficiente si se requiere acceso y eliminación en ambos extremos.  
- **Lista circular**: útil para simulaciones de ciclos (como turnos o colas que se repiten).
