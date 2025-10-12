# Análisis de Complejidad — Tabla Hash

---

## Complejidad teórica de las operaciones

| Operación | Descripción | Complejidad promedio | Peor caso |
|------------|--------------|----------------------|------------|
| **put(K, V)** | Inserta o actualiza un elemento en la tabla | O(1) | O(n) |
| **get(K)** | Busca el valor asociado a una clave | O(1) | O(n) |
| **remove(K)** | Elimina un elemento de la tabla | O(1) | O(n) |
| **containsKey(K)** | Verifica si una clave existe | O(1) | O(n) |
| **size()** | Devuelve el número total de elementos | O(1) | O(1) |
| **isEmpty()** | Indica si la tabla está vacía | O(1) | O(1) |

---

## Explicación

- En **promedio**, las operaciones tienen **tiempo constante O(1)** porque los elementos se distribuyen uniformemente en los buckets gracias a una buena función hash.  
- En el **peor caso**, todas las claves podrían caer en el mismo índice (colisiones extremas), formando una **lista enlazada de tamaño n**, lo que degrada el rendimiento a **O(n)**.

---

## Factores que influyen en el rendimiento

1. **Función hash:**  
   Debe dispersar las claves uniformemente para evitar concentraciones en ciertos índices.

2. **Tamaño de la tabla (`capacity`):**  
   Un tamaño pequeño genera más colisiones; un tamaño grande mejora el rendimiento pero consume más memoria.

3. **Factor de carga (`load factor`):**  
   Es la relación entre el número de elementos y el número de buckets.  
   Cuando este factor se acerca a 1, el número de colisiones aumenta.

---
## Conclusión

La tabla hash ofrece un **rendimiento promedio excelente** (O(1)) para las operaciones básicas,  
siempre que la función hash esté bien diseñada y el número de colisiones sea bajo.  
Sin embargo, en escenarios con demasiadas colisiones, el rendimiento puede degradarse a **O(n)**,  
razón por la cual se recomienda ajustar el tamaño de la tabla y aplicar estrategias de **rehashing** o **buenas funciones de dispersión** en implementaciones más avanzadas.
