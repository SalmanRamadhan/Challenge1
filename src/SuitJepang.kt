class SuitJepang (
    var pemain1: String,
    var pemain2: String
        ) {
    fun suit(pemain1: String, pemain2: String) {
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
            println("pemain1 menang")
        }
    }
}

