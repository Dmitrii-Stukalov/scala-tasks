def compress(list: List[Char]): List[Char] = list match {
  case first :: second :: _ => if (first == second) compress(list.drop(1)) else list.head :: compress(list.drop(1))
  case first :: Nil => List(first)
}

println(compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))