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
peso(Nodo(Hoja('l', 10), Nodo(Hoja('m',1), Hoja('n',4), List('m','n'),5), List('l','m','n'), 15))

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