package com.chalco.jose.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {
    @Test
    fun main() {
        val palabra = "hello" // Tenemos una palabra que vamos a usar como ejemplo

        // Aquí vamos a guardar cada letra de la palabra y cuántas veces aparece
        val frecuencia: MutableMap<Char, Int> = mutableMapOf()

        for (caracter in palabra) { // Vamos a revisar cada letra de la palabra
            if (frecuencia.containsKey(caracter)) { // Si ya tenemos esta letra en el mapa, le sumamos 1 a su contador
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                frecuencia[caracter] = 1 // Si es la primera vez que vemos esta letra, empezamos su cuenta en 1
            }
        }

        for ((caracter, freq) in frecuencia) {
            println("$caracter: $freq") // Al final, mostramos cuántas veces apareció cada letra
        }
    }
}
