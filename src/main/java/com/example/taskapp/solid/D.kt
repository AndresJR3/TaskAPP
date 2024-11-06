package com.example.taskapp.solid

// 5. principio D
// Princiío de Inversion de Dependencia
// Depender de Abstracciones y  no de construcciones

interface IStorage{
    fun leer()
    fun escribir()
}

class HDD : IStorage{
    override fun leer() {
        TODO("Not yet implemented")
    }

    override fun escribir() {
        TODO("Not yet implemented")
    }

}
class SSD : IStorage{
    override fun leer() {
        TODO("Not yet implemented")
    }

    override fun escribir() {
        TODO("Not yet implemented")
    }

}

class Computadora(val storage : IStorage){

}

interface IDB{
    fun getaAll()
    fun create()
}
class ConexionDBLocal{
    fun getAll(){
        //cosas
    }
}

class ConexionDBRemote : IDB{
    override fun getaAll() {
        TODO("Not yet implemented")
    }

    override fun create() {
        TODO("Not yet implemented")
    }

}

fun main(){
    val compu = Computadora(SSD())
}