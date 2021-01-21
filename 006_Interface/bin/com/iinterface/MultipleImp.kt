package com.iinterface

interface A {
	fun printMe() {
		println("method of interface A")
	}
}

interface B {
	fun printMeToo() {
		println("I am another method from interface B")
	}
}

class MutipleInterfaceExample : A, B

fun main(args: Array<String>) {
	val obj = MutipleInterfaceExample();
	obj.printMe()
	obj.printMeToo()
}