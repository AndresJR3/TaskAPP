package com.example.taskapp.solid

// 3. Principio L
// Principio de Sustitución de Liskov

open class Figura{
    open fun calcularArea() : Double = 0.0 //open para sobreescribir

}

class Triangulo(val base : Double, val altura : Double) : Figura(){
    override fun calcularArea(): Double {
        return base * altura / 2
    }
}

class Rectangulo(val base : Double, val altura: Double) : Figura(){
    override fun calcularArea(): Double{
        return base * altura
    }
}

fun main(){
    val triangulo = Triangulo(2.0, 3.0)
    val rectangulo = Rectangulo(2.0, 3.0)
    imprimirArea(triangulo)
}

fun imprimirArea(figura: Figura){
    println(figura.calcularArea())
}