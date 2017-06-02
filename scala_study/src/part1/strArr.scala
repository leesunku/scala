package part1

object strArr {
  def main(args: Array[String]): Unit = {
    val strArr = new Array[String] (3)
    strArr(0) = "hello"
    strArr(1) = "sk"
    strArr(2) = "lee"
    strArr.foreach { sa => println(sa) }
  }
}