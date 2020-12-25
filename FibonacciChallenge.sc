def fibonacci(n: Int): Long = {
  def recurrence(x: List[Int]) : List[Int] = {
    List(x(1), x.sum)
  }
  val x0 = List(0, 1)
  val funcList = List.fill(n)(recurrence _)
  val fx = funcList.reduce((x, y) => x compose y)
  fx(x0).head
}


println(fibonacci(20))