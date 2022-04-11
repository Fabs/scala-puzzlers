class Puzzle2 {
  var MONTH = 12; var DAY = 24 //Works

  //Does not work as those values don't exist, this is pattern matching
  // var (HOUR, MINUTE, SECOND) = (12, 0, 0)

  var HOUR = 12
  // would work, do nothing, but the compiler seems something weird
  //  var (HOUR, HOUR) = (12, 12)

  //The reason is upper case in patter matching is stable identifier for matching
  final val TheAnswer = 42
  def checkGuess(guess: Int) = guess match {
    case TheAnswer => "Your guess is correct"
    case _ => "Try again"
  }
}
