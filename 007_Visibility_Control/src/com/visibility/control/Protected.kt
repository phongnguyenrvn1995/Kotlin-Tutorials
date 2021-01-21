package com.visibility.control

open class A() {
	protected val i = 1
}

class B : A() {
	fun getValue(): Int {
		return i
	}
}


fun main(args: Array<String>) {
	val obj : B = B()
//	print(obj.i)
}