package com.example.kotlinday1


fun main() {
    val ints = listOf(2,3,4,5,2000)
    println(ints.filter { it>4 })


    val myString = listOf("dsfdvgbh","fsdf" ,"wereg" , "a")
    println(myString.filter { it.length >3 }.sortedBy{it})

    fun handleInteger(myInt : Int , operation: (Int) -> Unit){
        operation(myInt)
    }
    handleInteger(5) { println("myResult is ${it * 20}") }

    fun printResult( myInt: Int){
        println("my Int is ${myInt}")
    }

    handleInteger(4,::printResult) // printResult is the hoFunction here

    val values = listOf(25,5,10,4)
    println(values.filter { it > 5 }.sum())

    data class Person(val name : String , val age : Int)
    val sam = Person("Sam" , 30)

    val (name,age) = sam
    println("$name is $age years old")

    val names = mapOf<String,Int>("john" to 34 ,"fred" to 24 , "sam" to 30)
    for ((name ,age) in names.entries){
        println("name is  $name and age is  : $age")
    }


}