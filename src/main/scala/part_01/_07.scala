import scala.annotation.tailrec
import scala.collection.immutable.Nil
import scala.collection.immutable.ListSet

object Problem07 extends App {
  def flatten[A](xs: List[A]) = {
    @tailrec
    def flattenRec(xs: Any, ys: List[Any], acc: List[A]): List[A] =
      (xs, ys) match {
        case (Nil, Nil)       => acc
        case (Nil, y :: ys_)  => flattenRec(y, ys_, acc)
        case ((x :: xs_), _)  => flattenRec(x, xs_ :: ys, acc)
        case (x: A, y :: ys_) => flattenRec(y, ys_, x :: acc)
        case (_, _)           => throw new IllegalAccessException
      }
    xs match {
      case Nil     => Nil
      case x :: xs => flattenRec(x, xs, Nil).reverse
    }

  }
  println(flatten(List(List(0, List(1, 1)), 2, List(3, List(5, 8)))))

}
