package com.destructuring.declarations

data class Student(val a: String, val b: String) {
	var name: String = a
	var subject: String = b
}

fun main(args: Array<String>) {
	val s = Student("1", "2")
	val (name, subject) = s
	println(subject)
	println(name)
//	println(p)
}