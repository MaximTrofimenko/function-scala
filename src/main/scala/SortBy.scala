/**
 * Используем sortBy
 * Передача встроенных функций
 * стр. 117
 */
object SortBy {

  def main(args: Array[String]): Unit = {

    val words = List("Samsung", "Kotlin", "fire", "deal", "count")

    val result = rankedWords(w => score(w) + bonus(w) - fine(w), words)
    val result2 = rankedWords(score, words) //мы можем просто указать функцию score если она имеет нужную сигнатуру, без лишних кавычек

    println(result2)
  }

  private def rankedWords(wordScore: String => Int, words: List[String]): List[String] = {
    words.sortBy(wordScore).reverse
  }

  private def score(word: String): Int = {
    word.replaceAll("a", "").length
  }

  private def bonus(word: String): Int = {
    if (word.contains("c")) 5 else 0
  }

  private def fine(word: String) = if (word.contains("s")) 7 else 0

}
