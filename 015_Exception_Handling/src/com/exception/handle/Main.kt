package com.exception.handle

import java.lang.Exception

fun main(args: Array<String>) {
	try {
		val myVar: Int = 12
		val v: String = "Phong"
		v.toInt();
	} catch (ex: Exception) {
		println(ex)
	} finally {
		println("Exception Handeling in Kotlin");
	}
}