import scala.annotation.tailrec

@tailrec
def isPalindrome(list: List[Int]): Boolean = list match {
  case _ :: Nil => true
  case head :: tail :: Nil => head == tail
  case head :: tail => head == tail.last && isPalindrome(tail.dropRight(1))
}

println(isPalindrome(List(1, 2, 3, 2, 1)))
println(isPalindrome(List(1, 2, 3, 4, 1)))
println(isPalindrome(List(1, 1)))
println(isPalindrome(List(1, 2)))
