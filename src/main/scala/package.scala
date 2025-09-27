package object Huffman {
  abstract class ArbolH
  case class Nodo(izq: ArbolH, der: ArbolH, cars: List[Char], peso: Int) extends ArbolH
  case class Hoja(car: Char, peso: Int) extends ArbolH

  def peso(arbol: ArbolH): Int = arbol match {
    case Hoja(_, n) => n
    case Nodo(izq, der, _, pes) => pes
  }

  def cars(arbol: ArbolH): List[Char] = arbol match {
    case Hoja(x, _) => List(x)
    case Nodo(izq, der, x, _) => x
  }

  def hacerNodoArbolH(izq: ArbolH, der: ArbolH) = {
    Nodo(izq, der, cars(izq) ::: cars(der), peso(izq) + peso(der))
  }


}