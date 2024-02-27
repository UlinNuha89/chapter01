package practice

import app.ComputerSpecs

class ControlFlowExample {

    val name :String? = null
    private val computerData = listOf(
        ComputerSpecs(
            processorName = "intel i9",
            processorTotalCore = 8,
            isHaveIGPU = true,
            totalRamInGB = 32,
            EGPUName = "Rtx 4080"
        ),
        ComputerSpecs(
            processorName = "intel i7",
            processorTotalCore = 8,
            isHaveIGPU = true,
            totalRamInGB = 32,
            EGPUName = "Rtx 3060"
        )
    )

    fun run(){
        //if else
        /*println(checkName("ulin"))
        println(checkNameUsingWhen("ulin"))*/

        //checkName()
        printSomething()
    }

    fun checkName(name:String):String{
        return if (name ==null){
            "your name is empty"
        }else if(name.contains("ulin", ignoreCase = true)){
            "oh ulin toh"
        }else if(name.contains("real", ignoreCase = true)){
            "oh real toh"
        }else{
            "idk"
        }
    }

    //digunakan untuk nilai fix bukan contains
    private fun checkNameUsingWhen(name:String):String{
        return when(name){
            "ulin" -> "oh ulin"
            "agus" -> "agus? beneran?"
            else ->{
                "kamu siapa?"
            }
        }
    }

    private fun examokeEnum(){
        val cotentEnum = ContentType.photo
        when (cotentEnum){
            ContentType.photo ->{
                println("konten photo")
            }
            ContentType.video ->{
                println("konten video")
            }
            ContentType.reels ->{
                println("konten reels")
            }
        }

    }

    private var name1 : String?=null

    private fun checkName(){
        if (name1 != null){
            println("nama anda adalah $name1")
            println("pemilik toko bangunan")
        }
        //escape condition
        if (name1 == null)return
            println("nama anda adalah $name1")
            println("pemilik toko bangunan")

    }

    fun printSomething(): Unit {
        //for -loop 1
        println("biasa")
        for(index in 1..10){
            println(".....index ke"+index)
        }
        //escape looping tertentu
        for(index in 1..10){
            if(index==5)continue
            println(".....index ke"+index)
        }
        //stop loop
        for(index in 1..10){
            if(index==5)break
            println(".....index ke"+index)
        }
        /*
        println("step")
        //step
        for(index in 2..10 step 2){
            println(".....index ke"+index)
        }
        println("down to")
        //downto
        for(index in 10 downTo 1 step 2){
            println(".....index ke"+index)
        }
        //for looping manual
        for (index in computerData.indices){
            println("${index+1} ." +computerData[index].processorName)
        }
        //equivalent
        computerData.forEach{
            println("$it")
        }
        //with indexed
        computerData.forEachIndexed { index, data ->
            println("${index+1} "+computerData[index].processorName)
        }

        //do-while
        var index =0
        do{
            println(index)
            index++
        }while(index <5)

        index =0
        while (index < 5){
            println(index)
            index++
        }*/

    }




    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            ControlFlowExample().run()
        }
    }


}

//suatu class yg
// digunakan untuk identify sesuatu yang fixed
enum class ContentType{
    photo,video,reels
}