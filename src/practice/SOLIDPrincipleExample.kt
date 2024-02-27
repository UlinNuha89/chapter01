package practice

import practice.OOPExample

class CalculatorWrong() {
    fun plus(a: Int, b: Int) {
        val result = a + b
        println("Result = $result")
    }
}

class CalculatorRight() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun printResult(result: Number) {
        println("Result = $result")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            CalculatorRight().printResult(CalculatorRight().plus(7, 8))
        }
    }
}

//Single responsibility
class RockPaperScissor() {
    private var playerOne: Int = -1
    private var playerTwo: Int = -1
    fun printHeader() {
        println(
            """
            Gunting Batu Kertas
            Option
            0. gunting
            1. batu
            2. kertas
        """.trimIndent()
        )
    }

    fun run() {
        printHeader()
        inputPlayerOne()
        inputPlayerTwo()
        println(showResult(playerOne, playerTwo))
    }

    private fun showResult(playerOne: Int, playerTwo: Int): String {
        return if (((playerOne + 1) % 3) == playerTwo) {
            "Player 2 menang"
        } else if (playerOne == playerTwo) {
            "Seri"
        } else {
            "Player 1 menang"
        }
    }

    fun inputPlayerOne() {
        println("Masukkan pilihan 1 [0/1/2]: ")
        playerOne = readln().toInt()
    }

    fun inputPlayerTwo() {
        println("Masukkan pilihan 2 [0/1/2]: ")
        playerTwo = readln().toInt()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            RockPaperScissor().run()
        }
    }
}

//Open-Closed
open class IronManSuit() {
    open fun blast() {
        println("Shoot laser beam . . . ")
    }

    fun activateNanoTech() {
        println("Activate Nano tech")
    }
}

class WarMachineSuit() : IronManSuit() {
    override fun blast() {
        //super.blast()
        println("Shoot laser blast . . . ")
    }
}

//Liskov Substitution
//using hot air balloon
class Capadocia() {
    private lateinit var balloon: HotAirBalloon

    fun run() {
        //balloon = RedHotAirBalloon()
        balloon = BlueHotAirBalloon()
        balloon.apply {
            blow()
            carryPassengers()
            pop()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Capadocia().run()
        }
    }
}

//interface segregation
interface Animal {
    fun eat()
    fun hunt()
    fun walking()
    fun sleep()
    fun jump()
    fun breath()
    fun sound()
    fun reproduction()
}

interface Aves : Animal {
    fun fly()
}

interface Fish : Animal {
    fun swim()
}

class bird() : Aves {
    override fun eat() {

    }

    override fun hunt() {

    }

    override fun walking() {

    }

    override fun fly() {

    }

    override fun sleep() {

    }

    override fun jump() {

    }

    override fun breath() {

    }

    override fun sound() {

    }

    override fun reproduction() {

    }
}

class catfish() : Fish {
    override fun eat() {

    }

    override fun hunt() {

    }

    override fun walking() {

    }

    override fun swim() {

    }

    override fun sleep() {

    }

    override fun jump() {

    }

    override fun breath() {

    }

    override fun sound() {

    }

    override fun reproduction() {

    }
}


//dependency inversion
class FirebaseAnalytics() {
    fun log(event: String) {
        println("Logging to firebase : Event Name : $event")
        Thread.sleep(2000)
        println("Logging success !")
    }
}

class NewRelicAnalytics() {
    fun log(event: String) {
        println("Logging to NewRelic : Event Name : $event")
        Thread.sleep(2000)
        println("Logging success !")
    }
}

class MoEngageAnalytics() {
    fun log(event: String) {
        println("Logging to MoEngage : Event Name : $event")
        Thread.sleep(2000)
        println("Logging success !")
    }
}

class SplashScreen(private val analytics: Analytics) {
    fun openPage() {
        println("Open page SplashScreen . . . ")
        analytics.logEvent("SplashScreen")
    }
}

class HomePage(private val analytics: Analytics) {
    fun openPage() {
        println("Open page HomePage . . . ")
        analytics.logEvent("HomePage")
    }
}

class LoginPage(private val analytics: Analytics) {
    fun openPage() {
        println("Open page LoginPage . . . ")
        analytics.logEvent("LoginPage")
    }
}

class App() {
    private val analytics = AppAnalytics()
    fun run() {
        SplashScreen(analytics).openPage()
        HomePage(analytics).openPage()
        LoginPage(analytics).openPage()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}

//cara atau solusi jadi tidak boleh memberikan objek pasti dalam constructor class
interface Analytics {
    fun logEvent(event: String)
}

class AppAnalytics() : Analytics {
    private var firebaseAnalytics = FirebaseAnalytics()
    private var moEngageAnalytics = MoEngageAnalytics()
    private var newRelicAnalytics = NewRelicAnalytics()

    override fun logEvent(event: String) {
        println("Logging to MoEngage : Event Name : $event")
        Thread.sleep(2000)
        println("Logging success !")
    }
}

class SOLIDPrincipleExample {
}