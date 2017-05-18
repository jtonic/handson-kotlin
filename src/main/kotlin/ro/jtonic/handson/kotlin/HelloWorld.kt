/**
 * Created by jtonic on 25.09.2015.
 */

package ro.jtonic.handson.kotlin

fun main(args: Array<String>) {
    println("Hello Kotlin world!")

    var a = 1
    val b = 2
    var c = 1
    println("the sum is ${sum(a, b)}")

    a = 2

    val lst = mutableListOf(1, 2, 3)
    println("the list is $lst")

    var name: String? = null

    println("name chars length: ${name?.length}")

    println("name chars number: ${name?.length ?: -1}")

    name = "jtonic"
    val aInt: Int? = name as? Int
    println("aInt = ${aInt}")

    name = null
    println("Produce NPE. This is for NPE lovers.")
    println("name chars number 2: ${name!!.length}.")

//    c = null

    println(c)

}

