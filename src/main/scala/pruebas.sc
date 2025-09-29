import Huffman.{cars, *}

val h = Hoja('h',2)
val g = Hoja('g',1)
val d = Hoja('d',3)
val b = Hoja('b',8)
val a = Hoja('a',15)
val e = Hoja('e',11)
val c = Hoja('c',5)
val f = Hoja('f',4)

val listaInicial = List(
  // a: 15
  'a','a','a','a','a','a','a','a','a','a','a','a','a','a','a',
  // b: 8
  'b','b','b','b','b','b','b','b',
  // c: 5
  'c','c','c','c','c',
  // d: 3
  'd','d','d',
  // e: 11
  'e','e','e','e','e','e','e','e','e','e','e',
  // f: 4
  'f','f','f','f',
  // g: 1
  'g',
  // h: 2
  'h','h'
)




val nodo1 = Nodo(h,g,List('h','g'), 3)
val nodo2 = Nodo(d, nodo1, List('d','h','g'),6)
val nodo3 = Nodo(b, nodo2, List('d','h','g', 'b'), 14)
val nodo4 = Nodo(a, nodo3, List('d','h','g', 'b', 'a'), 29)
val nodo5 = Nodo(c, f, List('c', 'f'), 9)
val nodo6 = Nodo(e, nodo5, List('e', 'c', 'f'), 20)
val nodo7 = Nodo(nodo4, nodo6, List('d','h','g', 'b', 'a', 'e', 'c', 'f'),  49)
val nodoCompuesto =


peso(nodo7)

cars(nodo7)

val arbol = hacerNodoArbolH(nodo4,nodo6)

arbol.peso


def lookForX(x: Char, accL: List[(Char, Int)]):Boolean = {
  accL match {
    case Nil => false
    case (a, _) :: t => if (a == x) true else lookForX(x, t)
  }
}

lookForX('d', List(('b',2),('a',3),('c',4), ('d',4)))

val l1 = List(('b',2),('a',3),('c',4), ('d',4))

def updateX(x: Char, accL: List[(Char, Int)]):List[(Char, Int)] = {
  accL match {
    case Nil => Nil
    case (a, b) :: t => if (a == x)  (x, b+1) :: t else (a, b) :: updateX(x,t)
  }
}

updateX('c',l1)

def find(cars: List[Char], accL: List[(Char, Int)]): List[(Char, Int)] = cars match {
  case Nil => accL
  case x :: t =>
    val accL2 =
      if (lookForX(x, accL)) updateX(x, accL)
      else (x, 1) :: accL
    find(t, accL2)
}



find(List('a','b','c','c','b'),Nil)

listaDeHojasOrdenadas(ocurrencias(List('a','b','c','c','b')))


crearArbolDeHuffman(listaInicial)
