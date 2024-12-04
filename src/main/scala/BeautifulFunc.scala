/**
 * Передача встроенных функций
 * стр. 117
 */
object BeautifulFunc {

  def main(args: Array[String]): Unit = {

    val words = List("Samsung", "Kotlin", "fire", "deal", "count")

    val result = rankedWords(w => score(w) + bonus(w), words)
  }

  private def rankedWords(wordScore: String => Int, words: List[String]) = words.sortBy(wordScore).reverse

  private def score(word: String) = word.replaceAll("a", "").length

  private def bonus(word: String) = if (word.contains("c")) 5 else 0
}
