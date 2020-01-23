import java.{util => ju}

object Problem01 extends App {
  def last(xs: List[Int]): Int =
    xs match {
      case Nil      => throw new ju.NoSuchElementException
      case x :: Nil => x
      case x :: xs_ => last(xs_)
    }

  println(last(List(1, 2, 3, 5, 8)))
  println(last(List(1)))

}
