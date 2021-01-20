package com.classs.objectt

class MyClass {
	private var name: String = "Turorials.point"
	fun printMe(){
		println("You are at the best learning website named - $name")
	}
}

fun main(args: Array<String>) {
	val obj = MyClass()
	obj.printMe()
}