package com.classs.objectt

class Outer_{
	private val welcomeMsg : String = "Welcome to the tutorials"
	inner class Nested {
		fun foo() = welcomeMsg
	}
}

fun main(args:Array<String>){
	val demo : Outer_.Nested = Outer_().Nested()
	println(demo.foo())
}