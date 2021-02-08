package com.crash_course

/**functions
 * simplifying function declarations
 * Anonymous functions
 * Higher-order functions*/

fun main() {
    evaluateSomething(name = "A", surname = "M")
    println(generateAnswer(age = 45))
    System.out.println("Artur is my hero")
    System.out.println("Artur")
    System.out.println("Artur")
    val a:String=""
    val b:Int=28

    // Anonymous function
    val stringLengthFunc: (String) -> (Int) = { input ->
        input.length
    }

    val myCustomStringLenghth: (String) -> (Int) = { it.length }

    // chen grum incha mtnum, incha durs galis
    val lambda = { input: String -> input.length }

    val lambda2: (String) -> (Int) = { input -> input.length }

    // grum enq incha mtnum incha dirs galis
    val lambda3: (String, String) -> (Int) =
        { intput1: String, input2: String -> input2.length + intput1.length }


    println(
        stringMapper(
            "Artur",
            { input -> input.length })
    )  // menq enq realizacnum anounymus methodin
    println(customStringMapper("Musayelyan"))


}

// Simple functions
fun evaluateSomething(name: String, surname: String): String {
    return "$name $surname"
}

fun generateAnswer(age: Int): String = when {
    age > 35 -> "old"
    age == 35 -> "equal"
    else -> "young"
}

// Anonymous function
//val lenghtCounter: (String) -> (Int) = { input -> input.length }

val myCounter: (String) -> (Int) = { input -> input.length * 4 }

val lenght = fun(currentString: String): Int {
    return currentString.length
}

//higher-order functions
// talisa hetagayum ogtagorcelu azatutyun
fun stringMapper(currentString: String, mapper: (String) -> (Int)): Int {

    return mapper(currentString)
}


// miayn es dzevov es karum iran ogtagorces
fun customStringMapper(currentString: String, mapper: (String) -> Int = { it.length }): Int {

    return mapper(currentString)
}

fun myCounter(name: String, calculate: (String) -> (Int)): Int {
    return calculate(name)
}


