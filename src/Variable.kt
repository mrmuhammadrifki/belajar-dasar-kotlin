const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    val firstName = "Muhammad"
    val age = 21

    println(firstName)
    println(age)

    var name: String? = null
    name = "Rifki"
    println(name)
    println(name.length)

    println("$APPLICATION : $VERSION")
}