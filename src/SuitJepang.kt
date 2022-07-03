class SuitJepang (
    var pemain1: String,
    var pemain2: String
        ) {
    fun suit() {
        if (pemain1 == pemain2) {
            println("Draw")
        }
        if (pemain1 == "gunting" && pemain2 == "batu") {
            println("pemain2 menang")
        }
        if (pemain1 == "gunting" && pemain2 == "kertas") {
            println("pemain1 menang")
        }
        if (pemain1 == "batu" && pemain2 == "kertas") {
            println("pemain2 menang")
        }
        if (pemain1 == "batu" && pemain2 == "gunting") {
            println("pemain2 menang")
        }
        if (pemain1 == "kertas" && pemain2 == "batu") {
            println("pemain1 menang")
        }
        if (pemain1 == "kertas" && pemain2 == "gunting") {
            println("pemain2 menang")
        }
    }
}

