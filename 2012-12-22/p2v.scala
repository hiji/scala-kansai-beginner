import scala.collection.mutable.{ ListBuffer }

val lb = ListBuffer(2, 1)
while (lb(0) < 4000000) {
	(lb(0) + lb(1)) +=: lb
}
lb.tail.filter(_ % 2 == 0).sum

//println(lb.tail)
println(lb.tail.filter(_ % 2 == 0))