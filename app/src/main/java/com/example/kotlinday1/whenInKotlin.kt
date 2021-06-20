package com.example.kotlinday1


fun main() {
    val num = 10
    when( num){
        0-> println("zero")
        10 -> println("its a zero")
        else -> println("Non-Zero")
    }

    val string = "DOG"
    when(string){
        "CAT" , "DOG" ->println("animal")
        else -> println("Human")
    }

    when (num){
        in 1..9 -> println("B/W 1 to 9")
        in 10..20 -> println("B/W 10 to 20")
        else -> println("some other number")

    }
}