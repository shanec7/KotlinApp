package com.example.helloworld
// primary constructor needs at least 1 parameter
data class User(val id: Long, var name : String)

fun main() {
    val user1 = User(1, "Shane")

    user1.name = "Clark"
    val user2 = User(1, "Clark")
    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name = "Shane Clark")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // prints Shane Clark

    val (id, name) = updatedUser
    // this is same as
    // val id = updatedUser.id
    // val name = updatedUser.name
    println("id = $id, name = $name")


}