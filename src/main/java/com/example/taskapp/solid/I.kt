package com.example.taskapp.solid

// 4. Principio O
// Principio de Segregación de Interfaz -> un contrato que te obliga a tener propiedades o metodos

interface IAve{
    fun comer()
    fun duermen()

}
interface IAveVoladora{
    fun vuelan()
}

class Aguila : IAve, IAveVoladora {
    override fun comer() {
        println("comiendo")
    }

    override fun duermen() {
        println("durmiendo")
    }

    override fun vuelan() {
        println("volando")
    }
}

class Pinguino : IAve {
    override fun comer() {
        println("comiendo")
    }

    override fun duermen() {
        println("comiendo")    }

}