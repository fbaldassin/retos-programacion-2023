fun main() {
    for (number in 1..100) {
        if (number%5 == 0 && number%3== 0){
            println("fizzbuzz")
        } else if (number%5 == 0) {
            println("buzz")
        } else if (number%3 == 0) {
            println("fizz")
        } else {
            println(number)
        }
    }
}