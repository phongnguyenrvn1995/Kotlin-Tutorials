package com.extentions

class A {
	companion object {
		var i = 1;
		fun show(): String {
			return "You are learning Kotlin from TutorialsPoint.com"
		}
	}
}

fun main(args: Array<String>) {
	println(A.show())
	println(A.i)
}

