package com.example.helloworld

import java.lang.IllegalArgumentException

fun main() {
    // Creating instances of classes
//    var shane = Person("Shane", "Clark", 29)
//    shane.hobby = "to skateboard"
//    shane.age = 30;
//    println("Shane is ${shane.age} years old")
//    var john = Person()
//    john.hobby = "play video games"
//    var johnPeterson = Person(lastName = "Peterson")
//
//    shane.stateHobby();
//    john.stateHobby();

    //----------------------------------------------------------------------------------------------
    // lateinit, setters, getters
    //----------------------------------------------------------------------------------------------

    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Maxspeed is ${myCar.maxSpeed}")
    println("My model is ${myCar.myModel}")
}

class Car() {
    lateinit var owner : String

    val myBrand : String = "Toyota"
        //Custom getter
        get() {
            return field.toLowerCase()
    }

    var maxSpeed: Int = 250
        //get() = field
        // Custom setter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Max speed cannot be" +
                    " less than zero")
    }

    var myModel : String = "SR5"
        // setting the myModel to a private value, you can not change it in main
        private set

    init {
        this.owner = "Frank"
    }
}

class Person (firstName : String = "John", lastName: String = "Doe") {
    // Member Variables - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"
    var firstName : String = ""

    // initializer block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName $lastName")
    }

    // Member secondary Constructor
    constructor(firstName : String, lastName : String, age : Int)
        :this(firstName,lastName) {
        this.age = age
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName $lastName and age $age")
    }

    // Member Functions - Methods
    fun stateHobby() {
        println("$firstName\'s hobby is $hobby")
    }

}