package com.studying.functions.high_order

fun main() {
//    val pager = ViewPager(this)
//    pager.OnPageSelectedMyCallback{
//        print(it)
//    }


    //callbackExample(value = 5)

    println("Arthur".firstChar())
    printMe({ })

    setOnClickListener { println("I will do it") }

    iCandoSomething("call",{"call".length},{})
}

// extension
fun String.firstChar(): Char {
    return this.toCharArray().get(0)
}

//high-order
fun printMe(currentString: () -> Unit, currentElemnt: (String) -> (Int) = { 9 }) {
    currentString()
}

fun setOnClickListener(currentView: () -> Unit) {

}

fun doSomething(value: String, success: (code: String) -> (String)) {
    println(success(value))
}

val publishEvent:(String)->Unit={}

fun iCandoSomething(
    call: String,
    success: (String) -> Int,
    error: (String) -> Unit
) {

}
