package com.berivan.upschoolone

import java.util.Random
import java.util.Scanner




    fun main() {
        val random = Random()
        val yeniGirdi=random.nextInt(101)

        var guesses = 3

        val scanner = Scanner(System.`in`)

        while (guesses > 0) {
            print("Bir sayı tahmin edin (0 ile 101 arasında): ")
            val userGuess = scanner.nextInt()

            if (userGuess ==yeniGirdi) {
                println("Tebrikler, doğru tahmin ettiniz!")
                return
            } else if (userGuess < yeniGirdi) {
                println("Daha büyük bir sayı deneyin.")
            } else {
                println("Daha küçük bir sayı deneyin.")
            }

            guesses--
            println("Kalan tahmin hakkınız: $guesses")
        }

        println("Tahmin hakkınız bitti. Doğru sayı: $random")
    }






