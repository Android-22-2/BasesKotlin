package com.example.baseskotlin

fun main(){
    println(sumaIL(5,5))

    println(mayorIL(3,4))

    println(mayorILS(5,9))

    //Llamada a funcion inline
    val warriorCardCost = 4
    val randomDeckCardCost = 1

    playEffectCard(warriorCardCost,randomDeckCardCost){
        print("Aumentar armadura por 10")
    }

}
fun sumaIL(a: Int, b: Int) =  a + b

fun mayorIL(a: Int, b: Int) = if (a > b) a else b

fun mayorILS(a: Int, b: Int) = if (a > b)"A es mayor" else "B es mayor"

// Argumentos con valores default

// Palabra Reservada Inline
inline fun playEffectCard(cardCost1: Int, cardCost2: Int, onSuccess: () -> Unit) = if (cardCost1 > cardCost2) onSuccess() else println("Sin efectos")
