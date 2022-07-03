class Hopimpa(
    var pemain1: String,
    var pemain2: String,
    var pemain3: String
) {

    fun play(pemain1: String,pemain2: String,pemain3: String) {

        var counterHitam = 0
        var counterPutih = 0
        var pemainHitam = arrayListOf<String>()
        var pemainPutih = arrayListOf<String>()

        val arraypemain = arrayOf(pemain1,pemain2,pemain3)

        for(item in arraypemain.indices){
            if(arraypemain[item] == "hitam"){
                counterHitam+=1
                pemainHitam.add("pemain ${item+1}")
            } else {
                counterPutih+=1
                pemainPutih.add("pemain ${item+1}")

            }
        }

        if(counterPutih < counterHitam){
            println("pemain putih keluar")
            println(pemainPutih)
        } else if(counterHitam < counterPutih){
            println("pemain hitam keluar")
            println(pemainHitam)
        } else {
            println("draw")
        }

    }

}