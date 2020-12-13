def fib(x: List[Int]) : List[Int] = {
  List(x(1), x.sum)
}

val n = 10
val x0 = List(0, 1)
val funcList = List.fill(n)(fib _)
val fx = funcList.reduce((x, y) => x compose y)

val ans = fx(x0).head
println(ans)