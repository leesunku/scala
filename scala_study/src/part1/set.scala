package part1

object set {
  def main(args: Array[String]): Unit = {
    var set1 = Set("aa", "bb")
    set1 += "cc"
    println(set1)
    println(set1.contains("dd"))
    println(set1)
    
  }
}