class Hopimpa(
    var pemain1: String,
    var pemain2: String,
    var pemain3: String
) {

    fun play(pemain1: String,pemain2: String,pemain3: String) {

        var counterHitam = 0
        var counterPutih = 0

        val arraypemain = arrayOf(pemain1,pemain2,pemain3)

        for(item in arraypemain){
            if(item == "hitam"){
                counterHitam+=1
            } else {
                counterPutih+=1
            }
        }

        if(counterPutih < counterHitam){
            println("pemain putih keluar")
        } else if(counterHitam < counterPutih){
            println("pemain hitam keluar")
        } else {
            println("draw")
        }

    }




}