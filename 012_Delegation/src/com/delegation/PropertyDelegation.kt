package com.delegation

data class A(val id: Int, val name: String) {}

val myVarStr: String by lazy {
	"Hello"
}

val myVarA : A by lazy {
	A(1, "PHONG")
}


fun main(args: Array<String>) {
	println(myVarStr)
	println(myVarA)
}