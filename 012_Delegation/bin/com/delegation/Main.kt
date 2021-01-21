package com.delegation

interface Base {
	fun printMe()
}

class BaseImpl(val x: Int) : Base {
	override fun printMe() {
		println(x)
	}
}

class Derived(b: Base) : Base by b {
	
}

fun main(args: Array<String>) {
	val obj1 = BaseImpl(10)
	Derived(obj1).printMe()

	val obj2 = object : Base {
		override fun printMe() {
			println("I'm here")
		}
	}
	Derived(obj2).printMe()
}



