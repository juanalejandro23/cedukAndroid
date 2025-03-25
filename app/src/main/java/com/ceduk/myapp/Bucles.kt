package com.ceduk.myapp

fun main(){
    //val pedro = Sujeto("Pedro", 19)
    //val juan = Sujeto("Juan", 22)
    //val cesar = Sujeto("Cesar", 35)

    val cuenta = CuentaPremium(200.00)
    cuenta.depositar(50.00)
    cuenta.aplicarIntereses(0.1)
    println("Saldo en cuenta premium ${cuenta.verSaldo()}")

    val miAnimal = Animal()
    val miPerro = Perro()
    val miGato = Gato()

    miAnimal.sonido()
    miPerro.sonido()
    miGato.sonido()

    miAnimal.avanzar()
    miPerro.avanzar()
    miGato.avanzar()

    println(respuesta)

}

fun bucleFor(numeros: List<Int>){
    for (numero in numeros){
        if (numero % 2 == 0 ){
            println(numero)
        } else{
            continue
        }

    }
}

fun bucleWhile(contador: Int) {
    var contador = 5
    while (contador > 0){
        println("Cuenta atrás: $contador")
        contador--
    }
}

class Sujeto(val nombre: String, var edad: Int){

    init {
        println("${this.nombre} ha sido registrado con ${this.edad} años")
    }

    fun saludar() {
        println("Hola, soy ${this.nombre} y tengo ${this.edad} años")
    }
}

open class CuentaBancaria(protected var saldo: Double) {
    fun depositar(monto: Double){
         saldo += monto
    }
    fun verSaldo() = println(saldo)
}

class CuentaPremium(saldo: Double): CuentaBancaria(saldo){
    fun aplicarIntereses(tasa: Double) {
        saldo += saldo * tasa
    }
}

open class  Animal {
    open fun sonido() {
        println("Haciendo un sonido")
    }
    open fun avanzar() {
        println("Avanzó hacia adelante")
    }
}

class Perro: Animal(){
    override fun sonido() {
        println("Guau guau")
    }
}

class Gato: Animal(){
    override fun sonido() {
        println("Miau miau")
    }
}


var count: Int = 15
val respuesta: String = if(count >= 18) {
    "ya puedes pistear"
} else if (count < 18) {
    "no puedes pistear"
} else {
    "error"
}


