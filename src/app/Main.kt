package app

val index :Int = 0//immutable = tak bisa dirubah
var aString :String ="aku"//mutable = bisa dirubah

val String1="loe gua"
val num1 = 23
val num2 = 23.43
val num4 = 23479387
val num3 = 2347918249827

//array
val arrayData :Array<String> = arrayOf("a","b","c")
val arrData = arrayOf("1",2,"3")

//list tak bisa ditambah data
val listData : List<String> = listOf("1","2","3")
val lisData = listOf("1","2","3")

//list bisa ditambah
val mutableList = mutableListOf<String>("12","13","14")

fun main() {
    /*println(index)//=0
    println(aString)//=aku
    //index=2   gak bisa dirubah
    aString="gua"
    println(aString)//=gua
    println(arrData)
    println(arrData[0])
    println(mutableList)//12,13,14
    mutableList.add("15")
    println(mutableList)//12,13,14,15
    println(mutableList[1])//12,13,14,15
    mutableList.removeAt(0)
    println(mutableList)//13,14,15
    mutableList.remove("13")
    println(mutableList)//,14,15
    mutableList.addAll(listOf("16","17"))
    println(mutableList)//,14,15,16,17
    mutableList.add(0,"12"))
    println(mutableList)//12,14,15,16,17
*/
    printHeader()

}

fun printHeader(){
    println("=============================================")
    println("Order Pc app.App")
    println("=============================================")
    println("1. Bundle Ryzen 5 + RTX 3060")
    println("1. Bundle Ryzen 7 + RTX 4080")
    println("1. Bundle intel i5 + RTX 3060")
    println("1. Bundle intel i7 + RTX 4080")
    println("Masukkan pilihan anda ")
    try{
        val userPick = readln()
        //delay 1 second
        Thread.sleep(1000)
        println("pilihan anda $userPick")

    }catch (e : NumberFormatException){
        println("Pilihan anda salah")
        printHeader()
    }
}