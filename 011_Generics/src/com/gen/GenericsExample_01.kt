package com.gen

class genericsExample_01<T>(input: T) {
	init {
		println("I am getting called with the value " + input)
	}
}

fun main(args: Array<String>) {
	var obj1 = genericsExample_01("PHONG")
	var obj2 = genericsExample_01(1)
}