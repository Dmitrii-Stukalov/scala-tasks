def pack(list: List[Char]): List[List[Any]] = list match {
  case Nil => Nil
  case head :: tail =>
    val tmp = tail.dropWhile(_ == head)
    List(list.take(list.length - tmp.length)) :: pack(tmp)
}

println(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))