package o_o

abstract class Obsverable {

    val observers = mutableListOf<Observer>()

    fun registerObserver(observer: Observer) { //regista um observer
        observers.add(observer)
    }

    fun notifyChangedValue (newValue: Int){  //notifica os observers
        observers.forEach{
            it.valueChanged(newValue)
        }
    }
}


