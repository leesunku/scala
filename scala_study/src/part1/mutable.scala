package part1
object mutable {
  def main(args: Array[String]): Unit = {
    
    val mutableSet = scala.collection.mutable.Set("hh", "pp")
    mutableSet += "gg"
    print(mutableSet)
  }
}