//Ejercicio 31
// Ingresar un lote de N cajones de frutas y calcular el peso total de las frutas y cuanto en promedio deberia pesar cada cajon
//  50 cajones -> cajon 1 = 78kg
//								cajon 2= 83kg
//								cajon 3= 74kg
//								....
//								cajon 50= 79kg
//								Total de kg ?
//								Promedio de Kg de c/cajon

fun main() {

    print("\nIngrese la cantidad de cajones de frutas: ")
    val tope: Int = readLine()!!.toInt()
    var acuKilo: Float = 0F
    var prom: Float = 0F

    if (tope >= 1) {
        for (i in 1..tope) {
            print("Ingrese los kilos del cajon $i: ")
            val peso: Float = readLine()!!.toFloat()
            acuKilo += peso
        }
    } else {
        print("\nError: Ingreso una cantidad inválidad de cajones!!!")
    }

    prom = acuKilo / tope
    println("\nEl total de Kilos de frutas es: $acuKilo Kg")
    println("El promedio de Kilos de cada cajón de frutas es: $prom Kg")

}