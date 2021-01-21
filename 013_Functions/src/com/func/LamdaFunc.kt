package com.func

fun main(args: Array<String>) {
	val myLamda: (String) -> Unit = { s: String -> println(s) }
	myLamda("PHONG")

	val myFunc: (Int, String) -> Unit = { i: Int, s: String ->
		println("i = $i s = $s")
	}

	myFunc(1, "Phong")
}