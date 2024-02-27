package app

data class ComputerSpecs(
    var processorName : String,
    var processorTotalCore: Int,
    var isHaveIGPU : Boolean,
    var totalRamInGB : Int,
    var EGPUName :String
)
