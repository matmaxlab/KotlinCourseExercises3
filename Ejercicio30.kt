// Utilizando el ej 29 realizar las condiciones necesarias para poner una leyenda donde diga si el alumno aprobo o no la materia
// Recordar que debe ser de la siguiente forma:
// Nota es mayor e igual a 7 aprobo  -> 7 o mas "APROBO"
// Nota es entre 4 incluido y 7 no inclido el poner recupera -> 4 hasta 6,99 " RECUPERA"
// Nota es 4 o menor pero este no esta incluido poner reprobo -> 0 al 3,99 "REPROBO"

fun main() {


    var prom: Float

    for(i in 1..100){

        print("\nIngrese el nombre del alumno $i: ")                //Ingreso de nombre, apellido y curso por teclado
        val nombre: String = readLine()!!.toString()
        print("Ingrese el apellido del alumno $i: ")
        val apellido: String = readLine()!!.toString()
        print("Ingrese el año que cursa el alumno $i: ")
        val curso: String = readLine()!!.toString()
        var acu = 0                                                 //Inicializa el acumulador a cero

        for(j in 1..7){

            print("Ingrese la nota de la materia $j: ")             //Ingreso de las notas de las 7 materias
            val materia: Int = readLine()!!.toInt()
            acu += materia                                          //Acumula la sumatoria de las 7 materias

        }
        prom = (acu / 7).toFloat()                                  //Calcula el promedio por alumno
        print("\n$nombre, $apellido, $curso, Promedio $prom")     //Imprime el resultado para cada alumno

        if(prom >= 7 && prom <= 10){
            println("\nAprobo!!!")
        }else if(prom >= 4 && prom < 7){
            println("\nRecupera!!!")
        }else if(prom >= 0 && prom < 4) {
            println("\nReprobó!!!")
        }else {
            println("\nError: Ingresó una nota inválida!!!")
        }

    }

    print("\nFin del programa!!!\n")

}