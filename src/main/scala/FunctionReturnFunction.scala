/**
 * Функция возвращает функцию
 * стр. 123
 */
object FunctionReturnFunction {

  def main(args: Array[String]): Unit = {

    val words = List("ada", "haskell", "scala", "java", "rust")

    val function = highScoringWords(w => score(w), words)

    val result = function(3)

    //вернуть список со всеми числами больше указанного
    val numbers = List(5, 1, 2, 4, 0)
    val function1 = spisok(numbers)
    val result4 = function1(4)

    println(result4)
    //вернуть слова содержащие больше чем указанное количество букв S
    val words2 = List("ada", "rust")
    val moreThenS = compareToS(words2)
    val result2 = moreThenS(4)
    println(result2)
  }

  private def highScoringWords(wordScore: String => Int, words: List[String]): Int => List[String] = {
    higherThen => words.filter(word => wordScore(word) > higherThen)
  }

  private def score(word: String): Int = {
    word.replaceAll("a", "").length
  }

  private def spisok(numbers: List[Int]): Int => List[Int] = {
    higherThen => numbers.filter(i => i > higherThen)
  }

  private def compareToS(words: List[String]): Int => List[String] = {
    moreThen => words.filter(w => numberOfS(w) > moreThen)
  }

  private def numberOfS(word: String): Int = {
    word.length - word.replaceAll("s", "").length
  }
}
