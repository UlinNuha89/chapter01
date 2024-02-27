package practice

//Encapsulation
private class  AClass(){
    private fun run(){
        println("This is from class A")
    }
    fun runPublic(){
        println("This is from class A")
    }
}

private class  BClass(){
    fun run(){
        //AClass().run() //bcoz its private

        AClass().runPublic()
        println("This is from class B")
    }
}

//Abstraction
//kakek
interface Balloon{
    fun blow()
    fun pop()
}
//bapak
abstract class HotAirBalloon():Balloon{
    override fun blow() {
        println("Blow the balloon using hot air")
    }

    override fun pop() {
        println("Danger !!!")
    }
    fun moveLeft(){
        println("Move balloon to the left")
    }

    abstract fun carryPassengers()
}
//anak
class RedHotAirBalloon():  HotAirBalloon(){
    //wajib di implement di class,
    //fun pop dan blow tidak perlu karena ikut default abstract class
    override fun carryPassengers() {
        println("Carrying 5 passengers")
    }
    override fun blow() {
        println("Blow the balloon using Doa")
    }
    fun carryPassengers(number : String){
        println("Carrying $number passengers")
    }
}
class BlueHotAirBalloon():  HotAirBalloon(){
    //wajib di implement di class,
    //fun pop dan blow tidak perlu karena ikut default abstract class
    override fun carryPassengers() {
        println("Carrying 5 passengers")
    }
    override fun blow() {
        println("Blow the balloon using blue energy")
    }
    fun carryPassengers(number : String){
        println("Carrying $number passengers")
    }
}

class RedBalloon(): Balloon {
    override fun pop() {
        println("Meniup balon merah")
    }

    override fun blow() {
        println("Balon merah meledak")
    }
}

class BlueBalloon(): Balloon {
    override fun pop() {
        println("Meniup balon biru")
    }

    override fun blow() {
        println("Balon biru meledak")
    }
}

open class Processor(val name : String){
    open fun initProcessor(){
        println("Initialize . . . $name")
    }
}

class AMDProcessor(): Processor("Ryzen7 5500"){

}


fun main() {
    //inheritance, overload, override, polymorphism
    /*RedHotAirBalloon().let {
        //sifat kakek
        it.blow()
        it.pop()
        //sifat bapak
        it.carryPassengers()
        it.moveLeft()
    }*/
    AMDProcessor().initProcessor()
}




class OOPExample {
}