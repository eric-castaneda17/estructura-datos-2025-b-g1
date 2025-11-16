# Taller: Construcción de un Grafo y Recorrido BFS

Este proyecto implementa un grafo usando listas de adyacencia y el algoritmo
Breadth-First Search (BFS). También incluye cuatro ejercicios prácticos para
aplicar el recorrido BFS en diferentes contextos.

---

## Descripción de archivos principales

### **Graph.java**

Usa lista de adyacencia y una cola para realizar BFS.

### **BFSExample.java**
Ejemplo básico de funcionamiento del grafo y su recorrido BFS.

---

# Ejercicios

### **Ejercicio 1: Red social simple**
Usuarios representados como nodos; amistades como aristas.  
BFS se usa para recorrer la red desde un usuario inicial.

### **Ejercicio 2: Mapa de ciudades**
Representa ciudades conectadas entre sí y se ejecuta BFS desde una ciudad origen.

### **Ejercicio 3: Componentes conexos**
Grafos con varios componentes separados.  
El BFS solo recorre el componente donde inicia.

### **Ejercicio 4: Comparación BFS vs DFS**
Implementa una versión simple de DFS para contrastar el orden de recorrido con BFS.

---

## Análisis general

- BFS recorre nodos por niveles.
- Cada nodo y arista se procesa una sola vez.
- Ideal para encontrar rutas mínimas en grafos no ponderados.
- Los ejercicios permiten ver cómo se comporta BFS en:
  - grafos conectados,
  - grafos no conexos,
  - grafos prácticos (red social, mapa),
  - comparación contra DFS.

---

## Autor
- Eric Mauricio Castañeda Murcia
- Juan David Manrique Urbina
