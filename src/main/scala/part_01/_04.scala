import scala.annotation.tailrec
object Problem04 extends App {

  @tailrec
  def length(xs: List[Int], acc: Int = 0): Int =
    xs match {
      case Nil        => acc
      case (_ :: xs_) => length(xs_, acc + 1)
    }

  println(length(List(1, 2, 3, 5, 8)))
  println(length(List(1, 2, 3, 5, 8)))
  println(length(List(1, 2, 3, 5, 8)))
  println(length(List(1, 2, 3, 5, 8)))
  println(length(List(1, 2, 3, 5, 8)))
  println(length(List(1, 2, 3, 5, 8)))

}
