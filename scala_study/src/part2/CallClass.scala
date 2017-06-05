package part2

object CallClass {
  def main(args: Array[String]): Unit = {
    val class1 = new ClassEx
    val class2 = new ClassEx
    class1.sum = 5
    println(class1.sum)
    println(class2.sum)
    //println(class2.sum2)
    class2.add(10)
    class2.getSum2()
    
  }
}