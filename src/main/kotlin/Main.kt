/**
Возвращает окончание для множественного числа слова.
 */

val array = listOf("Человеку", "Людям")
val likeNumberOdd = 1101
val likeNumberEven = 4620

fun main() {
    getNumEnding(likeNumberOdd, array)
    getNumEnding(likeNumberEven, array)
}

fun getNumEnding(number: Int, array: List<String>) {
    val tempNumber = number % 100;

    if (tempNumber in 11..19) {
        println("Понравилось $number ${array[1]}")
    } else {
        var temp = number % 10
        when (temp % 10) {
            1 -> println("Понравилось $number ${array[0]}")
            2 -> println("Понравилось $number ${array[1]}")
            3 -> println("Понравилось $number ${array[1]}")
            4 -> println("Понравилось $number ${array[1]}")
            else -> println("Понравилось $number ${array[1]}")
        }
    }
}