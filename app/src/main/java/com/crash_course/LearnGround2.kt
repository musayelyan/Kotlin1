package com.crash_course

/**
 * conditionals: conditional expressions  if-else - poxaren when
 * $ concat operator
 * smart cast
 * safe call operator
 * elvis operator - karelia asel vor hamarjeqa ternary-in
 * not-null assertion operator - aysinqn uzum es ete null lini uremn gci NPE-i mej
 * */


fun main() {
    val count = 1994
    val age = 38


    val answerFromLogic: String = if (age == 10) {
        "young"
    } else if (age == 38) {
        "equal"
    } else {
        "old"
    }
    println(answerFromLogic)

    //aveli gexecik tarberak
    fun getLogicAnswer(age: Int): String {
        val answerLogic = when {
            age < 38 -> "young"
            age == 38 -> "equal"
            else -> "old"
        }
        return answerLogic
    }


    val name = "Artur"
    val surname = "Musayelyan"
    println("$name $surname 1994 $answerFromLogic ${getLogicAnswer(26)}")


    val address: String? = null
    if (address != null) {
        println(address.length)
    }

    //println(address?.length) // safe call
    address?.let { println(address.length) }

    val listWithNuls = listOf("A", null)

    for (item in listWithNuls) {
        item?.let { println(it.length) }
    }

    // elvis operator
    for (item in listWithNuls) {
        println(item?.length ?: "Everything is fine")
    }

    // !! not-null assertion operator
    for (item in listWithNuls) {
        println(item!!.length)
    }

}


/**
 * Kotlin’s conditionals highlight one of its more powerful features, smart casting. Rather than
 * using the safe-call operator or the not-null assertion operator to work with nullable values,
 * you can instead check if a variable contains a reference to a null value using a conditional
 * statement, as shown in the following example:
 *
 *
 * val languageName: String? = null
if (languageName != null) {
// No need to write languageName?.toUpperCase()
println(languageName.toUpperCase())
}
 */