package polling

fun main(){
    val termometro = Termometro()
    var temperaturaOld = termometro.temperatura
    var count = 0

    while(true){
        if (termometro.temperatura != temperaturaOld && !(temperaturaOld == termometro.temperatura)){
            count++
        }
        if(termometro.temperatura in -60..-80){
            println("Está fresquinho! Dava para guardar aqui as vacinas da Pfizer... Temperatura: ${termometro.temperatura}")
        }
        Thread.sleep(100)
        println(count)
    }

}
