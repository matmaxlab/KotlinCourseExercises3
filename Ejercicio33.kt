//Ejercicio Nro. 33
// Un sistema financiero nos pide que realicemos el analisis de una vela de HEINKE la cual segun sus resultados pueden ser
// al ingresar cuatro valores sumados y devididos por la cantidad de ingresos (Inicio + Fin + Max + Min) / 4
// Analizar el valor para saber el color de la vela ( Positiva = COLOR VERDE / Negativa = Color ROJO )
// Si -10 => Es una vela roja Agresiva  - Ej -14   ROJA AGRESIVA
// Si -9..-1 => Es vela roja Normal  - Ej -4 ROJA Normal
// Si 0 => Es vela Neutra   - Ej Neutra
// Si 1..9 => ES vela verde Normal   Ej 5 VERDE NORMAL
// Si 10 => Es vela verde Agresiva  EJ 23 VERDE AGERSIVA

fun main() {

    print("\nIngrese el Inicio de la vela de HEINKE: ")
    val inicio: Int = readLine()!!.toInt()
    print("Ingrese el Fin de la vela de HEINKE: ")
    val fin: Int = readLine()!!.toInt()
    print("Ingrese el Máximo de la vela de HEINKE: ")
    val max: Int = readLine()!!.toInt()
    print("Ingrese el Mínimo de la vela de HEINKE: ")
    val min: Int = readLine()!!.toInt()

    val estado: Float = ((inicio + fin + max + min) / 4).toFloat()

    when {
        estado <=-10F -> print("\nROJA AGRESIVA\n")
        estado in -9F..-1F -> print("\nROJA NORMAL\n")
        estado == 0F -> print("\nNEUTRA\n")
        estado in 1F..9F -> print("\nVERDE NORMAL\n")
        estado >= 10F -> print("\nVERDE AGRESIVA\n")
        else -> print("\nOcurrió un error!!!\n")
    }

}