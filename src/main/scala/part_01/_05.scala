import scala.annotation.tailrec

object Problem05 extends App {

  @tailrec
  def reverse[A](xs: List[A], acc: List[A] = Nil): List[A] =
    xs match {
      case Nil        => acc
      case (x :: xs_) => reverse(xs_, (x :: acc))
    }

  println(reverse(List(1, 2, 3, 5, 8)))
  println(reverse(List(10, 12, 34)))
  println(reverse(List("Abhishek", "Vaid", "Is", "In", "Town")))

}
