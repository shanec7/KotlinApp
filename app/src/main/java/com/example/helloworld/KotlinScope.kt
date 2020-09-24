package com.example.helloworld

val b = 2; // this can be accessed from all in the class

fun main() {
    myFunction(5)
    var b = 3; // this is not the same as be in the myFunction
}

// this is a parameter
fun myFunction(a:Int) {
    // a is a variable
    var b = a;
    println("a is $b")
}