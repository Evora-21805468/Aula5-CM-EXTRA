package polling

import java.util.*
import kotlin.concurrent.timerTask

class Termometro {

    private var _temperatura = (-100..0).random()
    val temperatura get() = _temperatura //não queremos um setter

    init{
        Timer().scheduleAtFixedRate(timerTask {
            _temperatura = (-100..0).random() //gera uma nova temperatura
        }, 0, 1000) //novas temperaturas a cada segundo (1000ms = 1s)
    }
}

