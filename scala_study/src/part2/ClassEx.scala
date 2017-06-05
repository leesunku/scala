package part2

class ClassEx {
  var sum = 0
  private var sum2 = 0
  
  def add(b : Int): Unit = {
    sum2 += b
  }
  def getSum2() = {
    print(sum2) 
  }
}
