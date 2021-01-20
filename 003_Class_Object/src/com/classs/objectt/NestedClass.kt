package com.classs.objectt

class Outer {
	class Nested {
		fun foo() = "Welcome to The TutorialsPoint.com"
	}
}

fun main(agrs: Array<String>) {
	val demo: Outer.Nested = Outer.Nested()
	print(demo.foo())
}