package com.constructors

fun main(args: Array<String>) {
	val human: Human = Human("Phong", 18, "HAHA")
	println(human.firstName)
	println(human.age)
	println(human.msg)
}

class Human(val firstName: String, var age: Int) {
	var msg: String = "Hey!!!"

	constructor (name: String, age: Int, msg: String) : this(name, age) {
		this.msg = msg
	}
}