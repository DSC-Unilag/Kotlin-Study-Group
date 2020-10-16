val numberList : ArrayList<Int> = arrayListOf();
var placeHolder : String = "";
var squareMap : MutableMap<Int,Int> = mutableMapOf();


fun main(args:Array<String>)
{
    println("_______________Test1____________________");
    getSquares("2 4 6 8 10 12 14 16 18 20");
    println("\n\n_________________Test2___________________");
    getSquares("1 2 3 4 5 6 7 8 9 10");
}

fun getSquares(word:String)
{//This is to convert the initial string collect from the user to a list if Integers.
    numberList.clear()
    if (word != null) {
        for(item in word){//loop through all characters of the String

            if(!item.equals(' ')){//since its separated by space we easily condition it to store the int once it sees a space.
                placeHolder += item.toString();
            }else{
                try{
                    numberList.add(Integer.parseInt(placeHolder))
                }catch (exception : NumberFormatException){
                    println("Integers Only!")
                    return;
                }

                placeHolder = "";
            }

        }
    }

    try{// To catch the last integer since it breaks out of loop after the last character.
        numberList.add(Integer.parseInt(placeHolder))
        placeHolder = "";
    }catch (exception : NumberFormatException){
        println("Integers Only!")
        return;
    }

    println(numberList)
    mapKeyToSquare(numberList)
    numberList.clear()
}
//to update the map with  the key and appropriate value pair.
fun mapKeyToSquare(keyList : ArrayList<Int>){
    squareMap.clear()
    for(eachKey in keyList) {
        squareMap[eachKey] = eachKey * eachKey
    }
    print(squareMap);

}
