import java.{util => ju}

object Problem02 extends App {

  def penultimate(xs: List[Int]): Int =
    xs match {
      case Nil             => throw new ju.NoSuchElementException
      case x :: Nil        => throw new ju.NoSuchElementException
      case (x :: _ :: Nil) => x
      case _               => penultimate(xs.tail)
    }

  println("Abhishek")
  println(penultimate(List(1, 2, 3, 5, 8)))
  println(penultimate(List(1, 2)))

}
