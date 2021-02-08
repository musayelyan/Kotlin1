package com.studying.classes_objects.classes_inheritance

fun main() {

    println(Student("Artur", "Musayelyan").firstName)
    Pen()
}

class Student constructor(
    val firstName: String,
    val secondName: String
) {
    constructor(firstName: String, secondName: String, id: Int) : this(firstName, secondName) {

    }
}

class Pen() {
    constructor(price: Int) : this()
}

open class Men(name: String) {

}

class Armenian(name: String) : Men(name) {
    constructor(name: String, surname: String) : this(name)
}

open class Shape() {
    open fun draw() {}

    fun fill() {}

    open var price: Int = 4800
}

class Circle() : Shape() {

    override var price: Int = 8999

    override fun draw() {
        super.draw()
    }
}

open class Rectangle {
    open fun draw() {}
}

interface Polygon {
    fun draw() {}
}

class Square() : Rectangle(), Polygon {
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}

