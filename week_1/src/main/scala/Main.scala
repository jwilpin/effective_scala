object Main extends App {

  def house(facade: Double, window: Double): Double =
    val door = 2 * 1
    val substractedArea = door + window * 2
    facade - substractedArea
  end house

  house(5*3, 1*1)

  if house(10,1) > 0 then
    println("mayor a cero")
  end if

  println("fin")

  def divide(x: Int, y: Int) : Int = ???//x / y
  //divide(1, 0)

  sealed trait Shape:
    def area: Double = this match
      case Rectangle(w, h) => w * h
      case Circle(r) => r * r * 3.1416
      //case Square(l) => l * l

  case class Rectangle(w: Int, h: Int) extends Shape
  case class Circle(r: Int) extends Shape
  case class Square(l: Int) extends Shape

  val r1 = Rectangle(1, 1)
  val r2 = Square(2)

  r1.area + r2.area


}
