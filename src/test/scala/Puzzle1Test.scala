import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._
import org.mockito.ArgumentMatchers.{any, anySet, anyString}
import org.mockito.ArgumentMatchersSugar._
import org.mockito.IdiomaticMockito.{DoSomethingOps, StubbingOps, VerifyingOps, called, returned, theRealMethod, twice}
import org.mockito.MockitoSugar.{mock, spy, times, verify, when}

import scala.language.postfixOps

class Puzzle1Test extends AnyFlatSpec with should.Matchers  {
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
