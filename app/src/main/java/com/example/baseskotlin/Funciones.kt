package com.example.baseskotlin

const val def: Int =100 // constante en tiempo de compilacion
fun main(){
    println(hola())
    //newTopic("Prueba de encapsulamiento")
    println(suma(5,3))

    val rresta = resta(3,2)
    val rmultiplicacion = multiplicacion(4,9)
    val a = 10
    val b = 2
    var rdiv = div(a,b)
    println("El resultado de la resta es de $rresta")
    println("El resultado del producto de a * b es de ${multiplicacion(4,9)}")
    println("El resultado del residuo entre $a y $b es de: $rdiv")

}

//: al definir Unit como valor de retorno quiere decir que esta funcion es un procedimiento
private fun hola() : String
{
    var saludo: String = "Hola Kotlin"
    return "Esto es un string"
}

private fun  suma(a: Int, b: Int): Int{
    var res = a + b
    return res
}


fun resta(a: Int, b: Int): Int {
    return a-b
}

fun multiplicacion(a: Int,b: Int):Int{
    return a*b
}

fun div(a: Int, b: Int): Int{
    return a/b
}

