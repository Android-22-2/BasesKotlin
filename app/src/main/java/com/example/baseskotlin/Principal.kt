package com.example.baseskotlin

fun main(){
    newTopic("Primeros Pasos con Kotlin")
    // Print y Println

    print("Hola Kotlin \n")
    print("Hola Holtin")
    print("Hola Holtin\n")
    println("Hola Kotlin")

    newTopic("Variables y Constantes")
    // val a = 7 Declaracion y asignacion sin tipo de dato
    // a = 2 comprobamos que es una constante
    val a: Int = 7 // Declaracion y asignacion de constante con su tipo de dato
    // Declaracion de variable
    var b = 14

    // StringTemplate
    println("El valor de la constante a es de: $a")
    println("El valor de la variable b es de: $b")

    newTopic("Funciones")
    // hola() No podemos acceder a una funcion privada

}

fun newTopic(topic: String){


    /*println("===================="+ topic +"====================")*/

    println("========== $topic ==========")
}

