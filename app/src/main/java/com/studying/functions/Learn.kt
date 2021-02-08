package com.studying.functions

import android.view.View

/**
 * special notation - family of function types
 * lambda {}
 * about lambda
 *
 * */
fun main() {

println(mapper2(4))
}

val mapper: (Int) -> (String) = { age: Int -> "Arusyak" }

val mapper2: (Int) -> (String) = {Armen:Int->
    "Arusyak $Armen"
}

fun printSomething(): Unit {

}

val lambda1: (String, String) -> (Int) =
    { name: String, surname: String -> name.length + surname.length }

fun doSomething(name: String, counter: (view: View) -> (Unit) = {}) {
    mapper
}


