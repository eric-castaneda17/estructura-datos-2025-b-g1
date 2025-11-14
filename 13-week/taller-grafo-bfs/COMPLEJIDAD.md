# Complejidad del algoritmo BFS

## Complejidad temporal

El algoritmo Breadth-First Search (BFS) recorre cada nodo y cada arista **una sola vez**.

Por esto, su complejidad es:


Donde:
- **V** = cantidad de vértices (nodos)
- **E** = cantidad de aristas (conexiones)

Esta complejidad es muy eficiente porque crece de forma lineal con el tamaño del grafo.

### Ejemplo
Si un grafo tiene:
- V = 6 nodos
- E = 7 aristas

Entonces:


---

## Tabla comparativa de operaciones

| Operación        | Descripción                    | Pasos aproximados |
|------------------|--------------------------------|--------------------|
| Agregar vértice  | Insertar un nodo nuevo         | 1 paso             |
| Agregar arista   | Conectar dos nodos             | 1 paso             |
| Recorrido BFS    | Visitar todos los nodos y aristas | V + E pasos        |

---

## Complejidad espacial

BFS utiliza:

- Una estructura de adyacencia: **O(V + E)**
- Una cola para almacenar nodos por visitar: **O(V)**
- Un conjunto de visitados: **O(V)**

Total aproximado:


---

## Conclusión

BFS es un algoritmo eficiente y fundamental para:
- recorrer grafos por niveles,
- encontrar caminos mínimos,
- analizar componentes conexos.

Su eficiencia está directamente relacionada con el número total de nodos y conexiones del grafo.
