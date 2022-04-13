import org.mockito.ArgumentMatchers.any
import org.mockito.MockitoSugar.{spy, times, verify}
import org.scalatest.flatspec._
import org.scalatest.matchers._

import scala.language.postfixOps

class Puzzle1Test extends AnyFlatSpec with should.Matchers {
  "sample1()" should "call print twice" in {
    val mockPuzzle = spy(new Puzzle1())

    mockPuzzle.sample1()

    verify(mockPuzzle, times(2)).wrapPrint(any())
  }

  "sample2()" should "call print once" in {
    val mockPuzzle = spy(new Puzzle1())

    mockPuzzle.sample2()

    verify(mockPuzzle, times(1)).wrapPrint(any())
  }
}
