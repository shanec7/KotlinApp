package com.example.helloworld

fun main() {
    // Creating instances of classes
    var shane = Person("Shane", "Clark", 29)
    shane.hobby = "to skateboard"
    shane.age = 30;
    println("Shane is ${shane.age} years old")
    var john = Person()
    john.hobby = "play video games"
    var johnPeterson = Person(lastName = "Peterson")

    shane.stateHobby();
    john.stateHobby();
}

class Person (firstName : String = "John", lastName: String = "Doe") {
    // Member Variables - Properties
    var age : Int? = null
    var hobby : String = "watch Netflix"

    // initializer block
    init {
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
        println("My hobby is $hobby")
    }
}