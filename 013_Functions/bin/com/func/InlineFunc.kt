package com.func

fun main(args: Array<String>) {
	val myLamda: (String) -> Unit = { s: String
		->
		val x = s + "1234"
		println(x);
	}
	val v: String = "TutorialsPoint.com"
	myFun(v, myLamda)


}

fun myFun(a: String, action: (String) -> Unit) {
	println("HEY!!!")
	action(a)
}