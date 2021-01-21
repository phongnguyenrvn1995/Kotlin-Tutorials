package com.visibility.control

private class PrivateExample(
	val id: Int,
	val name: String
)

fun main(args: Array<String>) {
	val obj = PrivateExample(1, "PHONG")
	println(obj.name)
}