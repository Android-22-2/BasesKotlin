package com.example.baseskotlin

fun main(){
    var edad : Any // La clase Any es la super clase, por lo que todo lo que derive de esta clase puede ser de cualquier tipo y no afectara la compilacion.
    // No es una buena practica utilizar el tipo Any
    edad = 30

    edad = "Treinta"

    edad = true

    var nombre = "Juan"

    //nombre = 12 una variable con un tipo de dato primitivo no puede cambiar su tipo de dato una vez asignada
}