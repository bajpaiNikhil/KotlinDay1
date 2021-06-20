package com.example.kotlinday1

fun main() {


    fun <t> printItem(item : t){
        println("My item is $item")
    }

    printItem(1)
    printItem("12345")

    fun <T> printList(list: List<T>){
        for (i in list){
            println(i)
        }
    }
    printList(listOf(1,2,3,4,5))
    printList(listOf("a","d","ere","fdvgbrh"))
}