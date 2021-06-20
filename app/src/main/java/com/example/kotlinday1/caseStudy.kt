package com.example.kotlinday1


class Student(){
    var studentName : String = ""
    var rollNo : Int = 0
    var marksScored : Int = 0
    var totalMarks : Int = 1000

    fun insert(studentName : String , rollNO : Int , marksScored : Int ){
        this.studentName = studentName
        this.rollNo = rollNO
        this.marksScored = marksScored
    }

    fun calculatePercetage(){
        val percentage : Float = marksScored /1000f
        println("Calculated Percentage is : ${percentage * 100}")
    }

    fun displayInfo(){
        println("Student Name : ${studentName}")
        println("Roll NO : ${rollNo}")
        println("Marks Scored : ${marksScored}")
    }
}

class University(){
    var name = Student().studentName
    var listOfStudent = listOf<Student>()

}
fun main() {

    val student1 = Student()
    student1.insert("sfdghj",2435,12)
    student1.calculatePercetage()
    student1.displayInfo()

    val uniStu = University()
    println(uniStu.listOfStudent)
}