/* Ejercicio NRo 32!!!!
// Nos piden con fines educativos realizar un programa para niñ@s donde se deben realir las tablas de multiplicar
  // desde la Tabla del 1 hasta la Tabla del 12
  Tabla del 1
1X1 = 1
1X2 = 2
1X3 = 3
...
12=12
Tabla del 2
2X1 = 2
...
2X12=24
Tabla del 3
3X1=3
...
3X12=36
...
...
12X12=144 */

fun main() {

    for(i in 1..12){
        print("\nTabla del $i\n\n")
        for(j in 1..12){
            val multi: Int = i * j
            println("\t$i x $j = $multi")
        }
    }

}