fun main(){

        println("==========================")
        println("GAMETERMINAL VERSION")
        println("==========================")
        println("Pilih Game: ")
        println("1. Hompimpa")
        println("2. Suit Jepang")
        println()
        println("Println : ")
        var input = readLine()

        do{
            var inputValid = true

            if(input == "1" || input == "2") inputValid = true
            else {
                inputValid = false
                println("Input hanya bisa 1 atau 2 mohon input kembali")
            }
        }while(!inputValid)

        when(input){
            "1"  -> hompimpaPlay()
            "2"  -> println("pilihan 2")
        }

}
fun hompimpaPlay(){

    var hopimpa = Hopimpa("Hitam","Hitam","Putih")
    hopimpa.play()

}



