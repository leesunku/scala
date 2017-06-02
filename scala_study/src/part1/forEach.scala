package part1

object forEach {
  def main(args: Array[String]): Unit = {
    var str = "hello, my name is skLee"
    str.foreach { s => println(s) }
  }
}