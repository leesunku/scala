

package part1

object ex1 {
  def main(args: Array[String]): Unit = {
		  var str = "Scala is even more fun"
				  var i = 0
				  while ( i < str.length()){
					  if ( i != 0 )
						  print(" ")
						  print(str(i))
						  i += 1
				  }
		  println()
  }
}