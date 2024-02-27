package practice

import app.ComputerSpecs

class ScopeFunctionExample {
    private val creatorName: String? = null
    private var computerData : ComputerSpecs? = null

    fun run() {
        //let and run
        creatorName?.let {
            println("Order Pc app.App $creatorName store")
        } ?: run {
            println("Order Pc store")
        }
        //apply
        println(computerData)

        // computer data is null
        computerData?.apply {
            this.processorName = "Intel Pentium"
        } ?: run {
            println("Computer data is null")
            computerData = ComputerSpecs(
                processorName = "intel i9",
                processorTotalCore = 8,
                isHaveIGPU = true,
                totalRamInGB = 32,
                EGPUName = "Rtx 4080"
            )
        }
        //computer data not null
        computerData?.apply {
            this.processorName = "Intel Pentium"
        } ?: run {
            println("Computer data not null")
        }
        println(computerData)

        //with //before
        println(computerData?.processorName)
        println(computerData?.totalRamInGB)
        println(computerData?.isHaveIGPU)

        //after //with
        with(computerData){
            println(this?.processorName)
            println(this?.totalRamInGB)
            println(this?.isHaveIGPU)
        }


    }


    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            ScopeFunctionExample().run()
        }
    }
}



