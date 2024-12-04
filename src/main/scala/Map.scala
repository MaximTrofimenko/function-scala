/**
 * Используем map
 * стр. 123
 */
object Map {

  def main(args: Array[String]): Unit = {

    val words = List("ada", "haskell", "scala", "java", "rust")

    val result = wordScores(w => score(w) + bonus(w) - penalty(w), words)
    val result2 = wordScores(w => countS(w), words)
    println(result2)

  }

  private def wordScores(wordScores: String => Int, words: List[String]): List[Int] = {
    words.map(wordScores)
  }

  private def score(word: String): Int = {
    word.replaceAll("a", "").length
  }

  private def bonus(word: String): Int = {
    if (word.contains("c")) 5 else 0
  }

  private def penalty(word: String) = if (word.contains("s")) 7 else 0

  private def length(word: String) = word.length

  private def countS(word: String) = word.length - word.replaceAll("s", "").length

  private def negative(number: Int) = -number

  private def double(number: Int) = 2 * number

}
