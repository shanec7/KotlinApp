package com.example.helloworld

//fun main() {
//    // immutable variable - can not be changed in my code
//    // var - variable can be changed later in my code
//
//
//    /*
//    This
//    is a multiline
//    comment
//     */
//
//    // type String
//    val myName = "Shane"
//    // type int 32 bit
//    // type inference finds out the type from context
//    var myAge = 29
//
//    // Integer TYPES: Byte (8 bit), Short (16 bit),
//    // Int (32 bit), Long (64 bit)
//
//    val myByte: Byte = 13
//    val myShort: Short = 125
//    val myInt: Int = 123123123
//    val myLong: Long = 39_812_309_487_120_300
//
//    // Floating Point number Types: Float (32 bit), Double (64 bit)
//    val myFloat: Float = 13.37F
//    val myDouble: Double = 3.14159265358979323846
//
//    // Booleans he type Boolean is used to represent logical values.
//    // It can have two possible values true and false.
//    var isSunny = true
//    isSunny = false
//
//    // Characters
//    val letterChar = 'A'
//    val digitChar = '1'
//
//    // String
//    val myStr = "Hello World"
//    var firstCharInStr = myStr[0]
//    var lastCharInStr = myStr[myStr.length - 1]
//
//
//    //print("Hello $lastCharInStr")
//
//    // Arithmetic operators (+, -, *, /, %)
//    var result = 5 + 3
//    var a = 5.0
//    var b = 3
//    var resultDouble : Double
//    resultDouble = a / b
//    //print(resultDouble)
//
//    // Comparison operators (==, !=, <, >, <=, >=)
//    val isEqual = 5 == 5
//    //println("isEqual is $isEqual")
//
//    val isNotEqual = 5 != 5
////    println("isNotEqual is $isNotEqual")
//
//    // String interpolation
////    println("is-5greater3 ${-5 > 3}")
////    println("is5LowerEqual3 ${5 < 3}")
////    println("is5GreaterEqual5 ${5 >= 5}")
//
//    // Assignment operators (+=, -=, *=, /=, %=)
//    var myNum = 5
//    myNum += 3
//    myNum *= 4
////    println("myNum $myNum")
//
//    // Increment & Decrement operators (++, --)
//    myNum++;
////    println("myNum is $myNum")
////    println("myNum is ${myNum++}") // increments after this line is finished
////    println("myNum is ${++myNum}")
////    println("myNum is ${--myNum}")
//
////    var heightPerson1 = 170
////    var heightPerson2 = 169
////
////    if(heightPerson1 > heightPerson2) {
////        println("Use raw force")
////    }else if(heightPerson1 == heightPerson2) {
////        println("Use your power technique 1337")
////    }else {
////        println("Use technique")
////    }
////
////    var age = 15
////    if(age >= 21) {
////        println("allowed to drink")
////    } else if (age >= 18) {
////        println("allowed to vote")
////    } else if (age >= 16) {
////        println("allowed to drive")
////    } else {
////        println("you are to young")
////    }
////
////    var name = "Shane"
////    if(name == "Shane") {
////        println("Welcome home Shane")
////    } else {
////        println("Who are you?")
////    }
////
////    val isRainy = true
////    if(isRainy)
////        println("It's rainy")
//
////    var season = 3
////    when(season){
////        1 -> println("Spring")
////        2 -> println("Summer")
////        3 -> {
////            println("Fall")
////            println("Autumn")
////        }
////        4 -> println("Winter")
////        else -> println("Invalid season")
////    }
////
////    var month = 3
////    when(month) {
////        in 3..5 -> println("Spring")
////        in 6..8 -> println("Summer")
////        in 9..11 -> println("Fall")
////        12,1,2 -> println("Winter")
////        else -> println("Invalid Season")
////    }
////
////    var age = 17
////    when(age) {
////        !in 0..20 -> println("drink")
////        in 18..20 -> println("vote")
////        16,17 -> println("drive")
////        else -> println("Too young")
////    }
////
////    var x : Any = "13.37f"
////    when(x){
////        is Int -> println("$x is an Int")
////        !is Double -> println("$x is not a Double")
////        is String -> println("$x is a String") // will not be executed for the x being a string because the not is double succeeds first
////        else -> println("$x is none of the above")
////    }
//
//    // while loops
////    var x = 1
////    while(x <= 10) {
////        print("$x")
////        x++
////    }
////    println("\nwhile loop is done")
//
////    var x = 100
////    while(x >= 0) {
////        println("$x")
////        x -= 2
////    }
////    println("\nwhile loop is done")
//
//    // do while loops
////    var x = 1
////    do {
////        print("$x")
////        x++
////    } while (x <= 10)
////    println("\ndo while loop is done")
////
////    var feltTemp = "cold"
////    var roomTemp = 10
////    while(feltTemp == "cold") {
////        println("$roomTemp")
////        roomTemp++
////        if(roomTemp >= 20) {
////            feltTemp = "comfy"
////            println("it's comfy now")
////        }
////    }
//
//    //for loop
//    for(num in 1..10) {
//        print("$num")
//    }
//    print("\n")
//    for(i in 1 until 10) {
//        print("$i")
//    }
//    print("\n")
//    for(i in 10 downTo 1 step 2) {
//        print("$i ")
//    }
//}