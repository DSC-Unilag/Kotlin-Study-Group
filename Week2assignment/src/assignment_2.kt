fun getSquares(string: String) {
    val myList = string.split(" ")
    val myMap = mutableMapOf<Int, Int>()

    for (i in myList) {
        val x = i.toInt()
        val xSquared = i.toInt() * i.toInt()
        myMap.put(key = x, value = xSquared)
    }
    println(myMap)
}

fun main() {
    println("______________Test1____________________");
    getSquares("2 4 6 8 10 12 14 16 18 20");
    println("\n\n_________________Test2___________________");
    getSquares("1 2 3 4 5 6 7 8 9 0");
}