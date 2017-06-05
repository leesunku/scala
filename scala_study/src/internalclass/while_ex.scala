package internalclass

object while_ex extends App{
  var a = 10
  var b = 20
  var result = 0
  while (a <= b) {
    result = result + a
    println(a)
    a+=1
  }
  println(result)
  println(gcd(3,12))
  def gcd(x : Long, y : Long): Long = {
		  if ( y == 0 ) x else gcd(y, x % y)
  }
}