package part1

object def_ex {
  def main(args: Array[String]): Unit = {
    print(max(3,5))
  }
  def max (x : Int, y : Int) = if ( x > y ) x else y
}