class Hopimpa(
    var pemain1: String,
    var pemain2: String,
    var pemain3: String
) {

    fun play() {

        var counterHitam = 0
        var counterPutih = 0
        var pemainHitam = arrayListOf<String>()
        var pemainPutih = arrayListOf<String>()

        val arraypemain = arrayOf(pemain1,pemain2,pemain3)

        for(item in arraypemain.indices){
            if(arraypemain[item].uppercase() == "HITAM"){
                counterHitam+=1
                pemainHitam.add("Pemain ${item+1}")
            } else {
                counterPutih+=1
                pemainPutih.add("Pemain ${item+1}")

            }
        }

        when{
            counterHitam == counterPutih -> {
                println("Tidak ada pemain yang keluar")
            }
            counterHitam == 3 || counterPutih == 3 -> {
                println("Tidak ada pemain yang keluar")
            }
            counterHitam > counterPutih -> {
                println("Pemain putih keluar")
                println(pemainPutih)
            }
            counterHitam < counterPutih ->{
                println("Pemain hitam keluar")
                println(pemainHitam)
            }

        }



       /* if(counterPutih < counterHitam){
            println("Pemain putih keluar")
            println(pemainPutih)
        } else if(counterHitam < counterPutih){
            println("Pemain hitam keluar")
            println(pemainHitam)
        } else {
            println("Draw")
        }*/

    }

}