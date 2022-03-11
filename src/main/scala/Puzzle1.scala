class Puzzle1 {
  def sample1(): Unit = {
    List(1, 2).map { i => wrapPrint("Hi"); i + 1 }
  }

  def sample2(): Unit = {
    List(1, 2).map {
      wrapPrint("Hi");
      _ + 1
    }
  }

  def wrapPrint(s: String): Unit = {
    println(s)
  }
}
