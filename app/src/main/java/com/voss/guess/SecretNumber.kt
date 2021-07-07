package com.voss.guess

import java.util.*

class SecretNumber {
    val secret: Int = Random().nextInt(100) + 1
    val scanner = Scanner(System.`in`)
    var limitTimes = 5
    var enterNumber: Int = 0
}

fun main() {
    val secretNumber = SecretNumber()
    println("Guess a secret Number ")
    for (i in 1..secretNumber.limitTimes) {
        println("chances : ${secretNumber.limitTimes - i + 1}")
        println("Enter a number :")
        secretNumber.enterNumber = secretNumber.scanner.nextInt()
        if (secretNumber.enterNumber == secretNumber.secret) {
            println("Bingo!! answer is ${secretNumber.secret} ,You still have ${secretNumber.limitTimes - i} chances left")
            break }
        else if (secretNumber.enterNumber > secretNumber.secret)
            if(i<secretNumber.limitTimes)println("Too big , You still have ${secretNumber.limitTimes - i} chances left")
            else println("Game over , chances empty")
        else if (secretNumber.enterNumber < secretNumber.secret)
            if(i<secretNumber.limitTimes)println("Too small,You still have ${secretNumber.limitTimes - i} chances left")
            else println("Game over , chances empty")
        else println("Error Please enter again , count times:$i")
    }
    println("--------------------------------")
    if (secretNumber.enterNumber != secretNumber.secret) println("You lose , the answer is ${secretNumber.secret}")
}
