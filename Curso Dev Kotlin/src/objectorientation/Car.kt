package objectorientation

class Car(var model: String, var power: Float = 1.0f, var maxSpeed: Int) {

    init {
        println("Use o cinto de segurança quando dirigir seu $model")
    }

    var currentSpeed = 0
        private set

    override fun toString(): String {
        return "Car(model='$model', power=$power, maxSpeed=$maxSpeed)"
    }

    fun speedUp() {
        println("Acelerando... velocidade atual: ${++currentSpeed}")
    }

    fun brake() {
        println("Freando... velocidade atual: ${--currentSpeed}")
    }

}

fun main(args: Array<String>) {

    val camaro = Car("Camaro", 4.2f, 290)
    val ferrari = Car("Ferrari", 6.2f, 350)
    val onix = Car("Onix", maxSpeed = 150)

    camaro.speedUp()
    camaro.speedUp()
    camaro.speedUp()
    camaro.brake()


    println(camaro)
    println(ferrari)
    println(onix)
}