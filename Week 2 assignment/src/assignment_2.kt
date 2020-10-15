
fun main(args:Array<String>) {
    println("_______________Test1____________________");
    getSquares("2 4 6 8 10 12 14 16 18 20");
    println("\n\n_________________Test2___________________");
    getSquares("1 2 3 4 5 6 7 8 9 0");
}

fun getSquares(word:String){
    val squared = ArrayList<Int>()
    val delimiter = " "
    val numberList =word.split(delimiter)

    for (i in numberList){
        val square = i.toInt() *i.toInt()
        squared!!.add(square)
    }
    //output the squared numbers
    for(a in squared){
        print("$a ")
    }
}