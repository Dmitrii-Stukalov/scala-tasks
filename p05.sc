def reverse(list: List[Int]): List[Int] = list match {
  case head :: tail :: Nil => List(tail, head)
  case head :: tail => reverse(tail) :+ head
}

println(reverse(List(1, 1, 2, 3, 5, 8)))