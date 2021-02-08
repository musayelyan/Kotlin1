package com.studying.classes_objects.properties

fun main() {


}

class Person {
    var price: Int? = 1
        get() = field
        set(value) {
            field = if (value==10){
                0
            }else{
                value
            }
        }
}