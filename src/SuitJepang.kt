class SuitJepang (
    var pemain1: String,
    var pemain2: String
        ) {
    fun suit() {
        if (pemain1 == pemain2) {
            println("Draw")
        }
        else if (pemain1.uppercase() == "GUNTING" && pemain2.uppercase() == "BATU") {
            println("pemain2 menang")
        }
        else if (pemain1.uppercase() == "GUNTING" && pemain2.uppercase() == "KERTAS") {
            println("pemain1 menang")
        }
        else if (pemain1.uppercase() == "BATU" && pemain2.uppercase() == "KERTAS") {
            println("pemain2 menang")
        }
        else if (pemain1.uppercase() == "BATU" && pemain2.uppercase() == "GUNTING") {
            println("pemain2 menang")
        }
        else if (pemain1.uppercase() == "KERTAS" && pemain2.uppercase() == "BATU") {
            println("pemain1 menang")
        }
        else if (pemain1.uppercase() == "KERTAS" && pemain2.uppercase() == "GUNTING") {
            println("pemain2 menang")
        }
    }
}

