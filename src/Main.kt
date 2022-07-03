fun main(){

        println("==========================")
        println("GAMETERMINAL VERSION")
        println("==========================")
        println("Pilih Game: ")
        println("1. Hompimpa")
        println("2. Suit Jepang")
        println()
        println("Pilihan : ")
        var input = ""




        do{
            input = readLine().toString()
            var inputValid = true
            if(input == "1" || input == "2"){
                inputValid = true
            }
            else {
                inputValid = false
                println("Input hanya bisa 1 atau 2 mohon input kembali")
            }

        }while(!inputValid)

        when(input){
            "1"  -> hompimpaPlay(input)
            "2"  -> println("pilihan 2")
        }

}
fun hompimpaPlay(input: String){

    println("Pilihan $input")
    println("Mulai bermain : ")
    var pemain1 = ""
    var pemain2 = ""
    var pemain3 = ""
    do{
        var status = true
       println("1. Masukan pemain 1 : ")
       pemain1 = readLine().toString()
       println("2. Masukan pemain 2 : ")
       pemain2 = readLine().toString()
       println("3. Masukan pemain 3 : ")
       pemain3 = readLine().toString()

        status = if(pemain1.uppercase() != "HITAM" && pemain1.uppercase() != "PUTIH"){
            println("input pemain 1 salah harap input Hitam atau Putih")
            false
        } else if(pemain2.uppercase() != "HITAM" && pemain2.uppercase() != "PUTIH"){
            println("input pemain 2 salah harap input Hitam atau Putih")
            false
        } else if(pemain3.uppercase() != "HITAM" && pemain3.uppercase() != "PUTIH"){
            println("input pemain 3 salah harap input Hitam atau Putih")
            false
        } else {
            true
        }

    }while (!status)


    var hopimpa = Hopimpa(pemain1,pemain2,pemain3)
    hopimpa.play()

}





