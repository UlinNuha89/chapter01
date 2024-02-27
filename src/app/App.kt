package app

class App(val creatorName: String?) {
    //default value constructor
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
    private var selectedComputer: ComputerSpecs? = null

    fun run() {
        printHeader()
    }

    private fun printHeader() {
        println("=============================================")
        //let and run
        creatorName?.let {
            println("Order Pc app.App $creatorName store")
        } ?: run {
            println("Order Pc store")
        }
        println("=============================================")
        computerData.forEachIndexed { index, data ->
            println("${index + 1}.${data.processorName} : ${data.EGPUName}")

        }
        getSelectedComputer()
    }

    private fun getSelectedComputer(){
        println("Masukkan pilihan anda ")
        try {
            val selectedIndex = readln().toInt()
            if (selectedIndex in 1..computerData.size) {
                selectedComputer = computerData[selectedIndex - 1]
                println("pilihan anda ${selectedComputer}")
            } else {
                println("pilihan anda salah.silahkan coba lagi")
                getSelectedComputer()
            }

        } catch (e: NumberFormatException) {
            println("Pilihan anda salah")
            printHeader()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val app = App("ulin")//with constructor
            app.run()
        }
    }
}
