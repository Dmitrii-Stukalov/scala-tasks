def flatten(value: List[Any]): List[Any] = value flatMap {
  case i: List[Any] => flatten(i)
  case el => List(el)
}

println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))