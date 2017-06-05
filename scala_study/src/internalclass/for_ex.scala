package internalclass

object for_ex extends App {
  for ( i <- 2 to 9 ){
    for ( j <- 1 to 9) {
      print(i + " * " + j + " = " + i*j + "\t")
    }
    println()
  }
}