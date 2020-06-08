open class ApioTask : Exec() {
    init {
        group = "apio"
    }
}

val apioBuild = task<ApioTask>("apioBuild") {
    commandLine("apio", "build")
}

val apioClean = task<ApioTask>("apioClean") {
    commandLine("apio", "clean")
}

val apioUpload = task<ApioTask>("apioUpload") {
    commandLine("apio", "upload")
}

val apioSim = task<ApioTask>("apioSim") {
    commandLine("apio", "sim")
}

apioUpload.dependsOn(apioBuild)
