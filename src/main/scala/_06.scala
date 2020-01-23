import scala.annotation.tailrec

object Problem06 extends App {

  def isPalindrome[A](xs: List[A]): Boolean = {
    def loop(xs: List[A], xsRev: List[A]): Boolean =
      (xs, xsRev) match {
        case (Nil, Nil)               => true
        case (x :: xs_, xR :: xsRev_) => x == xR && loop(xs_, xsRev_)
        case (_, _)                   => false
      }
    loop(xs, xs.reverse)
  }
  println(isPalindrome(List(1, 2, 3, 5, 8)))
  println(isPalindrome(List(1, 2, 3, 2, 1)))
}
