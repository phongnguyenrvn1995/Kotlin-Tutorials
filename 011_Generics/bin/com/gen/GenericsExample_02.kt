package com.gen

class GenericsExample_02<in T>() {
	var str: String = "";

	init {
		println("I am getting called with the value 02")
	}

	fun set(input: T) {
		this.str = input.toString();
	}
}

class GenericsExample_03<out T>() {
	var str: String = ""
	init {
		println("I am getting called with the value 03")
	}
	
	fun get() : T?{
		return null
	}
}

fun main(args: Array<String>) {
}