package o_o

fun main() {
    val termometro = Termometro()

    val temperaturaObserver = Observer { newValue ->
        println("Temperatura: ${termometro.temperatura} ºC")
    }

    val pfizerObserver = Observer { newValue ->
        println("Está fresquinho! Dava para guardar aqui as vacinas da Pfizer... Temperatura: ${termometro.temperatura}")
    }

    val astrazenecaObserver = Observer { newValue ->
        if (termometro.temperatura in 2..8){
            println("Estas vacinas da AstraZaneca... Eu guardava aqui era umas cervejas!")
        }
    }

    termometro.registerObserver(temperaturaObserver)
    termometro.registerObserver(pfizerObserver)
}

