package o_o

import java.util.*
import kotlin.concurrent.timerTask
import o_o.Obsverable as Observable1

class Termometro : Observable1(){

    var temperatura = (-90..10).random()
    private set(value) { //é invocado quando alteramos a temperatura
        field = value
        notifyChangedValue(value)
    }

    init {
        Timer().scheduleAtFixedRate(timerTask {
            temperatura = (-90..10).random() //a temperatura altera aqui
        }, 0, 1000)
    }
}


