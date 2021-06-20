package com.example.kotlinday1

typealias operation = (Int , Int) ->Int


fun main() {
    fun printMyName(){
        println("my name is lkdsfvpsiknol;")
    }
    printMyName()

    fun printlMultipleOfFive(value : Int){
        println("${value} * 5 = ${value*5}")
    }
    printlMultipleOfFive(10)

    fun printMultipleOf(multipler : Int , value : Int = 1){
        println("$multipler * $value = ${multipler * value}")
    }
    printMultipleOf(30)

    fun multiply(num : Int,multiplier : Int) : Int{
        return num * multiplier
    }
    println(multiply(2,32))

    fun multipleAndDivide(num : Int , factor : Int) :Pair<Int,Int>{
        return Pair(num*factor , num/factor)
    }

    println(multipleAndDivide(3,2))

    fun namewithLength(fullName : String , lastName :String ) : Pair<String , Int>{
        return Pair((fullName+lastName), (fullName+lastName).length)
    }

    println(namewithLength("fgsbh","dpfojngrh"))


    fun add(a: Int,b:Int) : Int{
        return a+b
    }
    var function : (Int,Int) ->Int =  ::add
    println(function(20,1))


}