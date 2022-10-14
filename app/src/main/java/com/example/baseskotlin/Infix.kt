package com.example.baseskotlin

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    val a = 20

    println((a >= 0) and (a <= 21))// Operador And

    val b = true
    val c = false

    println(b and c)
    println(b.and(c))

    // Funcion Infix personalizada
    val circle1 = Circle(5f,10f,10f)
    val circle2 = Circle(3f,8f,7f)

    println("¿Hay colision?: ${circle1 collideWith  circle2}")
    println("¿Hay colision?: ${circle1.collideWith(circle2)}")
}

class Circle(val radius: Float, var x: Float, var y: Float)

private infix fun Circle.collideWith(other: Circle): Boolean{
    val dx = this.x - other.x
    val dy = this.y - other.y
    val distance = sqrt(dx.pow(2) + dy.pow(dy))

    return distance < this.radius + other.radius
}
