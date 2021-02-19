import scala.annotation.tailrec

@tailrec
def last(list: List[Int]): Int = list match {
  case head :: Nil => head
  case _ :: tail => last(tail)
  case _ => throw new NoSuchElementException
}

println(last(List(1, 1, 2, 3, 5, 8)))
