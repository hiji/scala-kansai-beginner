def fib(max : Int) : List[Int] = {
	def fib(v1 : Int, v2 : Int) : List[Int] = {
		val v3 = v1 + v2
		if (v3 < max) v1 :: fib(v2, v3) else List(v1, v2)
	}
	fib(1, 2)
}

fib(4000000).filter(_ % 2 == 0).sum