//Adaptación con WHEN

fun main() {

    var numTabla: String = ""
    for(i in 1..12){
        when (i) {
            1 -> numTabla="UNO"
            2 -> numTabla="DOS"
            3 -> numTabla="TRES"
            4 -> numTabla="CUATRO"
            5 -> numTabla="CINCO"
            6 -> numTabla="SEIS"
            7 -> numTabla="SIETE"
            8 -> numTabla="OCHO"
            9 -> numTabla="NUEVE"
            10 -> numTabla="DIEZ"
            11 -> numTabla="ONCE"
            12 -> numTabla="DOCE"
        }
        print("\nTabla del $numTabla\n\n")
        for(j in 1..12){
            val multi: Int = i * j
            println("\t$i x $j = $multi")
        }
    }

}