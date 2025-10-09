import Huffman._

// Caso 1: peso de una hoja
// Esperado: 5
peso(Hoja('a', 5))

// Caso 2: peso de un nodo simple
// Esperado: 3
peso(Nodo(Hoja('a', 1), Hoja('b', 2), List('a','b'), 3))

// Caso 3: peso de un nodo con subárboles
// Esperado: 10
peso(Nodo(Nodo(Hoja('a',2), Hoja('b',3), List('a','b'), 5), Hoja('c',5), List('a','b','c'), 10))

// Caso 4: peso grande
// Esperado: 100
peso(Hoja('x', 100))

// Caso 5: peso en nodo desbalanceado
// Esperado: 15
peso(Nodo(Hoja('l', 10), Nodo(Hoja('m',1), Hoja('n', 4), List('m','n'),5), List('l','m','n'), 15))

// Caso 1: caracteres de una hoja
// Esperado: List('a')
cars(Hoja('a', 5))

// Caso 2: caracteres de un nodo simple
// Esperado: List('a','b')
cars(Nodo(Hoja('a',1), Hoja('b',2), List('a','b'), 3))

// Caso 3: caracteres de nodo con subárboles
// Esperado: List('a','b','c')
cars(Nodo(Nodo(Hoja('a',2), Hoja('b',3), List('a','b'), 5), Hoja('c',5), List('a','b','c'), 10))

// Caso 4: nodo con duplicados
// Esperado: List('a','a')
cars(Nodo(Hoja('a',4), Hoja('a',1), List('a','a'), 5))

// Caso 5: nodo con lista extensa
// Esperado: List('x','y','z')
cars(Nodo(Hoja('x',1), Nodo(Hoja('y',2), Hoja('z',3), List('y','z'),5), List('x','y','z'), 6))


val a = Hoja('a', 1)
val b = Hoja('b', 2)
// Caso 1: dos hojas con pesos distintos
// Esperado: Nodo(Hoja('a',1),Hoja('b',2),List('a','b'),3)
hacerNodoArbolH(a, b)


val izq = Hoja('x', 3)
val der = Nodo(Hoja('y', 2), Hoja('z', 2), List('y','z'), 4)
// Caso 2: hoja izquierda y nodo derecho
// Esperado: Nodo(Hoja(x,3),Nodo(Hoja(y,2),Hoja(z,2),List(y, z),4),List(x, y, z),7)
hacerNodoArbolH(izq, der)


val i = Nodo(Hoja('a',1), Hoja('b',3), List('a','b'), 4)
val d = Nodo(Hoja('c',2), Hoja('d',4), List('c','d'), 6)
// Caso 3: nodos equilibrados
// Esperado: Nodo(Nodo(Hoja(a,1),Hoja(b,3),List(a, b),4),Nodo(Hoja(c,2),Hoja(d,4),List(c, d),6),List(a, b, c, d),10)
hacerNodoArbolH(i, d)

val izqu = Hoja('a', 5)
val dere = Hoja('a', 1)
// Caso 4: duplicar caracteres
// Esperado: Nodo(Hoja(a,5),Hoja(a,1),List(a, a),6)
hacerNodoArbolH(izqu, dere)


val izqui = Hoja('m', 40)
val derec = Hoja('n', 60)
// Caso 5: árboles de un solo carácter con pesos grandes
// Esperado: Nodo(Hoja(m,40),Hoja(n,60),List(m, n),100)
hacerNodoArbolH(izqui, derec)


// Caso 1: ocurrencias simple
// Esperado: List(('b', 1), ('a', 2))
ocurrencias("aab".toList)

// Caso 2: todos distintos
// Esperado: List(('c', 1), ('b', 1), ('a', 1))
ocurrencias("abc".toList)

// Caso 3: dos caracteres repetidos
// Esperado: List(('b', 2), ('a', 2))
ocurrencias("abba".toList)

// Caso 4: solo espacios
// Esperado: List((' ', 2))
ocurrencias("  ".toList)

// Caso 5: lista vacía
// Esperado: Nil
ocurrencias("".toList)


// Caso 1: lista de frecuencias vacía
// Esperado: Nil
listaDeHojasOrdenadas(Nil)

// Caso 2: una sola frecuencia
// Esperado: List(Hoja('x', 4))
listaDeHojasOrdenadas(List(('x', 4)))

// Caso 3: dos frecuencias desordenadas
// Esperado: List(Hoja('b', 1), Hoja('a', 3))
listaDeHojasOrdenadas(List(('a', 3), ('b', 1)))

// Caso 4: tres frecuencias mezcladas
// Esperado: List(Hoja('c', 2), Hoja('d', 4), Hoja('e', 6))
listaDeHojasOrdenadas(List(('d', 4), ('c', 2), ('e', 6)))

// Caso 5: frecuencias con empates
// Esperado: List(Hoja('b', 1), Hoja('a', 1), Hoja('c', 2))
listaDeHojasOrdenadas(List(('a', 1), ('b', 1), ('c', 2)))





// Caso 1: lista vacía
// Esperado: List()
combinar(List.empty[ArbolH])

// Caso 2: lista unitaria
// Esperado: List(Hoja('x', 4))
combinar(List(Hoja('x', 4)))

// Caso 3: dos hojas
// Esperado: List(Nodo(Hoja('a',1),Hoja('b',2),List('a','b'),3))
combinar(List(Hoja('a', 1), Hoja('b', 2)))

// Caso 4: tres hojas ordenadas
// Esperado: List(Hoja('c',3), Nodo(Hoja('a',1),Hoja('b',2),List('a','b'),3))
combinar(List(Hoja('a', 1), Hoja('b', 2), Hoja('c', 3)))

// Caso 5: cuatro hojas con pesos distintos
// Esperado: List(Nodo(Hoja('a',1),Hoja('b',2),List('a','b'),3), Hoja('c',4), Hoja('d',5))
combinar(List(Hoja('a', 1), Hoja('b', 2), Hoja('c', 4), Hoja('d', 5)))


// Caso 1: solo un carácter
// Esperado: Hoja(a,2)
crearArbolDeHuffman("aa".toList)

// Caso 2: dos caracteres distintos
// Esperado: Nodo(Hoja(a,1),Hoja(b,1),List(a, b),2)
crearArbolDeHuffman("ab".toList)

// Caso 3: texto con carácter dominante
// Esperado: Nodo(Hoja(b,1),Hoja(a,2),List(b, a),3)
crearArbolDeHuffman("aba".toList)

// Caso 4: cuatro caracteres distintos
// Esperado: Nodo(Nodo(Hoja(c,1),Hoja(a,1),List(c, a),2),Nodo(Hoja(b,1),Hoja(d,1),List(b, d),2),List(c, a, b, d),4)
crearArbolDeHuffman("abcd".toList)

// Caso 5: texto con frecuencias variadas
// Esperado: Nodo(Hoja(a,2),Nodo(Hoja(c,1),Hoja(b,2),List(c, b),3),List(a, c, b),5)
crearArbolDeHuffman("aabbc".toList)


val arbolD1 = Nodo(Hoja('x', 1), Hoja('y', 1), List('x', 'y'), 2)
// Caso 1: dos hojas, decodificar bits simples
// Esperado: List('x', 'y')
decodificar(arbolD1, List(0, 1))


val arbol2 = Nodo(Hoja('a', 1), Hoja('b', 1), List('a', 'b'), 2)
// Caso 2: árbol simple con dos hojas
// Esperado: List('a', 'b', 'a')
decodificar(arbol2, List(0, 1, 0))

val arbol3 = crearArbolDeHuffman("aba".toList)
// Caso 3: decodificar texto corto
// Esperado: List('a', 'b', 'a')
decodificar(arbol3, List(1, 0, 1))

val arbol4 = crearArbolDeHuffman("abcd".toList)
// Caso 4: árbol balanceado con cuatro caracteres
// Esperado: List(c, a, b, d)
decodificar(arbol4, List(0, 0, 0, 1, 1, 0, 1, 1))

val arbol5 = crearArbolDeHuffman("banana".toList)
// Caso 5: árbol desbalanceado con repeticiones
// Esperado: List('b', 'a', 'n', 'a', 'n', 'a')
decodificar(arbol5, codificar(arbol5)("banana".toList))



val arbolC1 = Hoja('x', 1)
// Caso 1: árbol con una sola hoja
// Esperado: List()
codificar(arbolC1)("x".toList)

val arbolC2 = Nodo(Hoja('a', 1), Hoja('b', 1), List('a', 'b'), 2)
// Caso 2: dos caracteres simples
// Esperado: List(0, 1)
codificar(arbolC2)("ab".toList)

val arbolC3 = crearArbolDeHuffman("aba".toList)
// Caso 3: texto con carácter dominante
// Esperado: List(1, 0, 1)
codificar(arbolC3)("aba".toList)

val arbolC4 = crearArbolDeHuffman("abcd".toList)
// Caso 4: cuatro caracteres distintos
// Esperado: List(0, 1, 1, 0, 0, 0, 1, 1)
codificar(arbolC4)("abcd".toList)

val arbolC5 = crearArbolDeHuffman("banana".toList)
// Caso 5: texto largo con repeticiones
// Esperado: List(1, 0, 0, 1, 1, 0, 1, 1, 0)
codificar(arbolC5)("banana".toList)



val tabla1 = List(('a', List(0)), ('b', List(1)))
// Caso 1: tabla simple con dos entradas
// Esperado: List(0)
codigoEnBits(tabla1)('a')

val tabla2 = List(('x', List(0, 0)), ('y', List(0, 1)), ('z', List(1)))
// Caso 2: tabla con códigos de distintas longitudes
// Esperado: List(0, 1)
codigoEnBits(tabla2)('y')

val tabla3 = convertir(crearArbolDeHuffman("aba".toList))
// Caso 3: buscar código en tabla generada
// Esperado: List(0)
codigoEnBits(tabla3)('b')

val tabla4 = List(('m', List(1, 1, 0)), ('n', List(1, 1, 1)))
// Caso 4: códigos largos
// Esperado: List(1, 1, 0)
codigoEnBits(tabla4)('m')

val tabla5 = List(('a', List(0)))
// Caso 5: tabla unitaria
// Esperado: List(0)
codigoEnBits(tabla5)('a')



val tablaA1 = List(('a', List()))
val tablaB1 = List(('b', List()))
// Caso 1: dos tablas con un elemento cada una
// Esperado: List(('a', List(0)), ('b', List(1)))
mezclarTablasDeCodigos(tablaA1, tablaB1)

val tablaA2 = List(('a', List(0)), ('b', List(1)))
val tablaB2 = List(('c', List(0)), ('d', List(1)))
// Caso 2: dos tablas con dos elementos cada una
// Esperado: List((b,List(0, 1)), (a,List(0, 0)), (d,List(1, 1)), (c,List(1, 0)))
mezclarTablasDeCodigos(tablaA2, tablaB2)

val tablaA3 = List(('x', List()))
val tablaB3 = List(('y', List()), ('z', List()))
// Caso 3: tablas de diferente tamaño
// Esperado: List((x,List(0)), (z,List(1)), (y,List(1)))
mezclarTablasDeCodigos(tablaA3, tablaB3)

val tablaA4 = Nil
val tablaB4 = List(('a', List()))
// Caso 4: una tabla vacía
// Esperado: List(('a', List(1)))
mezclarTablasDeCodigos(tablaA4, tablaB4)

val tablaA5 = List(('m', List(1, 0)), ('n', List(1, 1)))
val tablaB5 = List(('o', List(0)))
// Caso 5: códigos pre-existentes
// Esperado: List((n,List(0, 1, 1)), (m,List(0, 1, 0)), (o,List(1, 0)))
mezclarTablasDeCodigos(tablaA5, tablaB5)



val arbolConv1 = Hoja('x', 5)
// Caso 1: hoja única
// Esperado: List(('x', List()))
convertir(arbolConv1)

val arbolConv2 = Nodo(Hoja('a', 1), Hoja('b', 1), List('a', 'b'), 2)
// Caso 2: nodo simple con dos hojas
// Esperado: List(('a', List(0)), ('b', List(1)))
convertir(arbolConv2)

val arbolConv3 = crearArbolDeHuffman("aba".toList)
// Caso 3: árbol del texto 'aba'
// Esperado: List((b,List(0)), (a,List(1)))
convertir(arbolConv3)

val arbolConv4 = crearArbolDeHuffman("abcd".toList)
// Caso 4: árbol balanceado de cuatro caracteres
// Esperado: List((a,List(0, 1)), (c,List(0, 0)), (d,List(1, 1)), (b,List(1, 0)))
convertir(arbolConv4)

val arbolConv5 = crearArbolDeHuffman("aabbc".toList)
// Caso 5: árbol con frecuencias variadas
// Esperado: List((a,List(0)), (b,List(1, 1)), (c,List(1, 0)))
convertir(arbolConv5)



val arbolRap1 = Hoja('z', 1)
// Caso 1: árbol con una hoja
// Esperado: List()
codificarRapido(arbolRap1)("z".toList)

val arbolRap2 = Nodo(Hoja('a', 1), Hoja('b', 1), List('a', 'b'), 2)
// Caso 2: dos caracteres
// Esperado: List(0, 1, 0)
codificarRapido(arbolRap2)("aba".toList)

val arbolRap3 = crearArbolDeHuffman("aba".toList)
// Caso 3: debe dar el mismo resultado que codificar
// Esperado: List(1, 0, 1)
codificarRapido(arbolRap3)("aba".toList)

val arbolRap4 = crearArbolDeHuffman("abcd".toList)
// Caso 4: cuatro caracteres distintos
// Esperado: List(1, 1, 0, 0, 1, 0, 0, 1)
codificarRapido(arbolRap4)("dcba".toList)

val arbolRap5 = crearArbolDeHuffman("banana".toList)
// Caso 5: texto largo
// Esperado: List(1, 0, 0, 1, 1, 0, 1, 1, 0)
codificarRapido(arbolRap5)("banana".toList)