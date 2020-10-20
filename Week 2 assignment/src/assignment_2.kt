
fun main(args:Array<String>)
{
    println("_______________Test1____________________");
    getSquares("2 4 6 8 10 12 14 16 18 20");
    println("\n\n_________________Test2___________________");
    getSquares("1 2 3 4 5 6 7 8 9 0");
}

fun getSquares(word:String)
{
  val intArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    
    println(intArray.toList())
    
     val ranges = 0..9
    for (i in ranges){
        println("$i*$i")
    }
}
