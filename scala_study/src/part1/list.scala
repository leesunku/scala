package part1

object list {
  def main(args: Array[String]): Unit = {
    val oneTwoThree = List(1,2,3)
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoTreeFour = oneTwo ::: threeFour
    print(oneTwoTreeFour)
  }
}