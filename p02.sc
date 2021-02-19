import scala.annotation.tailrec

@tailrec
def penultimate(list: List[Int]): Int = list match {
  case first :: _ :: Nil => first
  case _ :: tail => penultimate(tail)
  case _ => throw new NoSuchElementException
}


println(penultimate(List(1, 1, 2, 3, 5, 8)))