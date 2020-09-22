package com.example.helloworld

fun main() {
    // immutable variable - can not be changed in my code
    // var - variable can be changed later in my code
    // TODO: Add new functionality

    /*
    This
    is a multiline
    comment
     */

    // type String
    val myName = "Shane"
    // type int 32 bit
    // type inference finds out the type from context
    var myAge = 29

    // Integer TYPES: Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)

    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // String
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]


    //print("Hello $lastCharInStr")

    // Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    var a = 5.0
    var b = 3
    var resultDouble : Double
    resultDouble = a / b
    //print(resultDouble)

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 5
    println("isEqual is $isEqual")

}