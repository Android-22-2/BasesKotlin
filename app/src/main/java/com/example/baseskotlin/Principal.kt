package com.example.baseskotlin

fun main(){
    newTopic("Primeros Pasos con Kotlin")
    print("==================== ")
    print("Impresiones")
    print(" ====================\n ")
    newTopic("Variables y Constantes")
    // val a = 7 Declaracion y asignacion sin tipo de dato
    // a = 2 comprobamos que es una constante
    val a: Int = 7 // Declaracion y asignacion de constante con su tipo de dato
    // Declaracion de variable
    var b = 14


    println("El valor de la constante a es de: $a")
    println("El valor de la variable b es de: $b")


}

fun newTopic(topic: String){


    /*println("===================="+ topic +"====================")*/

    println("========== $topic ==========")
}

