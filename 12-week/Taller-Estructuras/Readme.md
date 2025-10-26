# Taller de Estructuras de Datos — Java

## Descripción general

Este proyecto corresponde al **taller práctico de estructuras de datos**.  
El objetivo es **implementar las principales estructuras** vistas en clase: pilas, colas, tablas hash, árboles binarios, árboles balanceados (AVL), árboles de búsqueda (BST) y grafos.  

Finalmente, se presenta un **proyecto integrador** que combina grafos y pilas, con su respectivo análisis.

---

## Entregables y estructuras implementadas

| Tema | Archivo | Descripción |
|------|----------|-------------|
| Pilas | `PilaUndoRedo.java` | Simula las funciones **Deshacer/Rehacer** en un editor utilizando dos pilas. |
| Colas | `ColaPrioridad.java` | Sistema de atención con prioridades usando `PriorityQueue`. |
| Tablas Hash | `TablaHash.java` | Registra usuarios únicos por identificación con `HashMap`. |
| Árboles Binarios | `ArbolBinario.java` | Implementa los recorridos **inorden, preorden y postorden**. |
| Árboles Balanceados (AVL) | `ArbolAVL.java` | Inserciones en un árbol AVL e identificación de rotaciones. |
| Árbol Binario de Búsqueda (BST) | `ArbolBusqueda.java` | Implementa búsqueda, inserción y eliminación en un BST. |
| Grafos | `GrafoRutas.java` | Modela un grafo de ciudades y calcula rutas más cortas (Dijkstra). |
| Proyecto Integrador | `ProyectoIntegrador.java` | Combina un grafo y una pila para simular movimientos y deshacer pasos. |

---
## Explicación breve del funcionamiento de cada estructura

1. Pila (PilaUndoRedo.java)
Simula las funciones de Deshacer/Rehacer en un editor.
Utiliza dos pilas:
- undoStack → Guarda acciones realizadas.
- redoStack → Guarda acciones deshechas.

Operaciones:
- doAction() agrega una nueva acción.
- undo() deshace la última acción.
- redo() repite una acción deshecha.

Complejidad: todas las operaciones son O(1).

2. Cola con prioridad (ColaPrioridad.java)
Implementa un sistema de atención con prioridades.
Los clientes con prioridad menor (1 = más urgente) son atendidos primero.
Usa una PriorityQueue y la interfaz Comparable.

Complejidad: inserción y extracción O(log n).

3. Tabla Hash (TablaHash.java)
Permite registrar usuarios únicos por identificación.
Utiliza HashMap donde la clave es el ID y el valor es el nombre o usuario.
- addUser() evita duplicados.
- getUser() y removeUser() realizan operaciones básicas.

Complejidad promedio: O(1).

4. Árbol Binario (ArbolBinario.java)
Implementa los recorridos:
- Preorden: raíz → izquierda → derecha
- Inorden: izquierda → raíz → derecha
- Postorden: izquierda → derecha → raíz
Permite visualizar cómo se recorren los nodos de un árbol.

Complejidad: O(n) (visita cada nodo una vez).

5. Árbol AVL (ArbolAVL.java)
Inserta nodos en un árbol balanceado automáticamente.
Detecta desbalances y aplica:
- Rotación simple derecha o izquierda.
- Rotación doble (izq-der / der-izq).
Muestra en consola qué rotación se realiza.

Complejidad: inserción O(log n).

6. Árbol de Búsqueda (ArbolBusqueda.java)
Implementa operaciones:
- Insertar un nuevo valor.
- Buscar un elemento.
- Eliminar un nodo (casos 0, 1 y 2 hijos).
Respeta la propiedad del BST:
valores menores a la izquierda, mayores a la derecha.

Complejidad promedio: O(log n).

7. Grafo (GrafoRutas.java)
Modela un mapa de ciudades usando listas de adyacencia.
Aplica el algoritmo de Dijkstra para hallar la ruta más corta desde una ciudad origen.

Complejidad: O((V + E) log V).

---
## Analisis de complejidad

| Estructura / Operación | Complejidad|
|:-----------|:---------:|
| Pila (push, pop, peek)   | O(1)  |
| Cola con prioridad (add, poll)   | O(log n)   |
| HashMap (put, get, remove)  | O(1) promedio   |
| Árbol binario (recorridos)    | O(n)   |
| AVL (inserción, búsqueda)    | O(log n)   |
| BST (inserción, búsqueda, eliminación)  | O(log n) promedio   |
| Grafo (Dijkstra)    | O((V + E) log V)   |
| Proyecto integrador (operaciones)    | O(1)   |

---
## 👤 Autor
**[ERIC MAURICIO CASTAÑEDA MURCIA]**  
Curso: Estructura de Datos  
Lenguaje: Java  