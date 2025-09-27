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

  /*
  Recibe la palabra como una lista de caracteres y devuelve
  una lista de tuplas en la que cada caracter esta asociado a su frecuencia
   */
  def ocurrencias(cars: List[Char]): List[(Char, Int)] = {
    def lookForX(x: Char, accL: List[(Char, Int)]):Boolean = {
      accL match {
        case Nil => false
        case (a, _) :: t => if (a == x) true else lookForX(x, t)
      }
    }

    def updateX(x: Char, accL: List[(Char, Int)]): List[(Char, Int)] = {
      accL match {
        case Nil => Nil
        case (a, b) :: t => if (a == x) (x, b + 1) :: t else (a, b) :: updateX(x, t)
      }
    }

    def find(cars: List[Char], accL: List[(Char, Int)]): List[(Char, Int)] = cars match {
      case Nil => accL
      case x :: t =>
        val accL2 =
          if (lookForX(x, accL)) updateX(x, accL)
          else (x, 1) :: accL
        find(t, accL2)
    }

    find(cars, Nil)
  }

}