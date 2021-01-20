package com.constructors

fun main(args: Array<String>) {
	val person1 : Person = Person("Phong", 18)
	println(person1.firstName)
	println(person1.age)
}

class Person(val firstName: String, var age: Int) {
	
}