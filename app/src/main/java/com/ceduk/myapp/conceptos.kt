package com.ceduk.myapp

fun main() {

    //println(saludar(name = "Juan"))
    //println(suma(numA = 2, numB = 3))
    //println(resta(numA = 5, numB = 1))

    //val operacion = obtenerOperacion("suma")
    //val resultado = operar(5,3){x,y -> x * y}

    //var cuadrado: (Int) -> Int = {num -> num * num}

    //val numerosPrimos = listOf(1,3,5,7,11,13)
    //println(numeros.sumarElementos())
    //println(numerosPrimos.sumarElementos())
    //numeros.forEach {
    //    println(it * 2)
    //}

    //val duplicar: (Int) -> Int = { it * 2}

    //val texto = "Kotlin"
    //println(texto.reversa())

    //val juan = Persona("Juan")
    //juan.saludar()

    //val ejemplo = Ejemplo()
    //ejemplo.mensaje()

    val numeros = listOf(1,2,3,4,5)
    val cuadrados = numeros.map { it * it }
    val pares = numeros.filter { it % 2 != 0}
    val sumaTotal = numeros.reduce { acc, i -> acc + i}
    val numerosMutable = mutableListOf(1,2,3,4,5)

    println(numerosMutable)
    numerosMutable.add(2)
    println(numerosMutable)

    println("Cuadrados: $cuadrados")
    println("Pares: $pares")
    println("SumaTotal: $sumaTotal")
}

fun tiposDeDatos() {
    //este es un comentario de una linea

    /*
    este es un comentario de varias lineas
     */

    //tipos de datos:

    //numericos
    val byteExample1: Byte = 127;
    val shortExample1: Short = -32768;
    var intExample1: Int = 214748364;
    val longExample: Long = 2147483648;

    //decimales
    val floatExample1: Float = 3.141592f;
    val doubleExample1: Double = 3.141592653589793;

    //strings
    val charExample1: Char = 'a';
    val stringExample1: String = "esto es una cadena de texto";

    //boolean
    val verdadero: Boolean = true;
    val falso: Boolean = false;

    intExample1 = 2147483;
    //print(intExample1);
}

fun tiposDeOperadores(){
    /*tipos de operadores
    - aritmeticos (+,-,*,/,%)
    - logicos (||,&&, !)
    - relacionales (<,>,=,===,<=,>=,!=)
     */

    var num1: Int = 40;
    var num2: Int = 20;
    var num3: Int = 50;

    var suma: Int = num1 + num2;
    var resta: Int = num1 - num2;
    var multiplicacion: Int = num1 * num2;
    var division: Double = num1.toDouble() / num2.toDouble();

    var string1: String = "el resultado";
    var string2: String = "de la operacion";

    // ¿num1 es menor que num2?
    if(num1 < num2){
        println("el numero $num1 es menor que $num2");
    } else if(num1 > num3){
        println("el numero $num1 es mayor que el $num3 ");
    } else if(num1 > num3){
        println("el numero $num1 es mayor que el $num3 ");
    }else if(num1 > num3){
        println("el numero $num1 es mayor que el $num3 ");
    }else if(num1 > num3){
        println("el numero $num1 es mayor que el $num3 ");
    }else {
        println("es el numero de en medio.")
    }

    val diaDeLaSemana: String = "domingo";

    when (diaDeLaSemana) {
        "lunes" -> println("el dia de la semana es: lunes");
        "martes" -> println("el dia de la semana es: martes");
        "miercoles" -> println("el dia de la semana es: miercoles");
        "jueves" -> println("el dia de la semana es: jueves");
        "viernes" -> println("el dia de la semana es: viernes");
        "sabado" -> println("el dia de la semana es: sabado");
        else -> println("el dia de la semana es: domingo");
    }
}

fun saludar(name: String): String {
    return "hola $name, bienvenidos a kotlin"
}

fun suma(numA: Int, numB: Int): Int{
    return numA + numB
}

fun resta(numA: Int, numB: Int): Int =  numA - numB

fun operar(numA: Int, numB: Int, operacion: (Int,Int) -> Int): Int {
    return operacion(numA,numB)
}

fun obtenerOperacion(tipo: String): (Int,Int) -> Int {
    return when (tipo){
        "suma" -> {x, y -> x +y}
        "resta" -> {x, y -> x - y}
        "multiplicacion" -> {x, y -> x * y}
        "division" -> {x, y -> x / y}
        else -> {_, _, -> 0}
    }
}

fun String.reversa(): String {
    return this.reversed()
}

fun Persona.saludar(){
    println("Hola, mi nombre es $nombre")
}

fun List<Int>.sumarElementos(): Int {
    return this.sum()
}

/*class*/
class Persona(val nombre: String)



