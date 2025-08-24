# Taller - Tipos de datos en java.

## Objetivo del taller. 
Comprendan los diferentes tipos de datos en Java, tanto primitivos como no primitivos, y aprender a aplicarlos en la resolución de problemas. A través de cinco ejercicios.

## Explicacion de ejercicios.

### Ejercicio1_ISBN13
- Primero se asegura de que el número tenga exactamente 13 dígitos.
- Comprueba que todos los caracteres sean números (no letras ni símbolos).
- Luego hace una cuenta especial:
- Los dígitos que están en posición par se multiplican por 1.
- Los que están en posición impar se multiplican por 3.
- Suma todos esos resultados.
- Si el total termina en cero (es decir, divisible entre 10), entonces el ISBN es válido.

### Ejercicio2_RLE
- Pide al usuario un texto.
- Comprime ese texto contando cuántas veces seguidas aparece cada carácter.
- Muestra el texto original, el comprimido y la proporción entre ambos.

Cómo funciona:
1. Entrada: El usuario escribe un texto.
2. Compresión (compress):
- Recorre el texto letra por letra.
- Cuenta cuántas veces seguidas se repite cada carácter.
- Guarda en el resultado el carácter seguido de su número de repeticiones.
- Ejemplo: "aaabbc" → "a3b2c1".
3. Salida: 
- Muestra el original, el comprimido y el ratio (longitud comprimido ÷ longitud original).

## Ejercicio3_Temperaturas
Qué hace:
1. Pide temperaturas.

2. Calcula y muestra:
- Mínima
- Máxima
- Promedio (media)
- Desviación estándar (medida de dispersión).

Cómo funciona:

1. Entrada: El usuario escribe números separados por comas.
2. Conversión: Divide el texto en partes (split) y lo transforma en un arreglo de double.
3. Recorrido:
- Encuentra el mínimo y el máximo.
- Suma todas las temperaturas para el promedio.
4. Desviación estándar:
- Calcula la varianza: promedio de las diferencias al cuadrado respecto al promedio.
- Saca la desviación estándar.
5. Salida: Muestra los resultados.

## Ejercicio4_ConversorBases
Qué hace:

1. Pide al usuario un número y la base en la que está escrito (puede ser 2 = binario, 10 = decimal o 16 = hexadecimal).
2. Convierte ese número a las tres bases y las muestra.
3. Usa long normalmente, pero si el número es demasiado grande, usa BigInteger para poder manejarlo sin límite de tamaño.

Cómo funciona:

1. Entrada:
- El usuario ingresa un número como texto (String).
- Ingresa la base de ese número.
2. Conversión con long:
- Intenta transformar el número con Long.parseLong(numero, base).w
- Si funciona, lo imprime en binario, decimal y hexadecimal.
3. Si el número es muy grande:
- Lanza una excepción.
- Convierte e imprime en las tres bases.
4. Salida extra:
- Indica si se usó BigInteger o no.

## Ejercicio5_Tiempos
Este programa toma una lista de tiempos escritos en el formato horas:minutos:segundos (HH:MM:SS):

1. Convierte cada tiempo a segundos:
- 00:05:33 → 333 segundoss
- 00:12:17 → 737 segundoss
- 00:03:50 → 230 segundos
2. Suma todos los segundos → 1300 segundos, que equivalen a 00:21:40. Ese es el tiempo total.
3. Calcula el promedio dividiendo 1300 entre 3 → 433 segundos, que son 00:07:13.
4. Busca el tramo más largo: el mayor es 737 segundos, o sea 00:12:17, que está en el índice 1 de la lista.
5. Calcula el porcentaje de cada tramo respecto al total:
- Tramo 0: 25.62 %
- Tramo 1: 56.69 %
- Tramo 2: 17.69 %