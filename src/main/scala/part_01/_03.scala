object Problem03 extends App {

  def kth(k: Int, xs: List[Int]): Int =
    (k, xs) match {
      case (_, Nil)        => throw new NoSuchElementException
      case (0, (x :: _))   => x
      case (_, (_ :: xs_)) => kth(k - 1, xs_)
    }

  println(kth(0, List(1, 2, 3, 5, 8)))
  println(kth(1, List(1, 2, 3, 5, 8)))
  println(kth(2, List(1, 2, 3, 5, 8)))
  println(kth(3, List(1, 2, 3, 5, 8)))
  println(kth(4, List(1, 2, 3, 5, 8)))
  println(kth(5, List(1, 2, 3, 5, 8)))

}
