package com.iinterface

interface ExampleInterface {
	var myVar: String
	fun absMethod(): String
	fun sayHello() {
		println("Hello there, Welcome to TutorialsPoint.Com!")
	}
}

class InterfaceImp : ExampleInterface {
	override var myVar: String = "PHONG"

	override fun absMethod(): String {
		return "Happy Learning "
	}
}

fun main(args: Array<String>) {
	val obj: ExampleInterface = InterfaceImp();
	println("My variable value is = ${obj.myVar}")
	print("Calling hello: ")
	obj.sayHello()

	print("Message from the website -- ")
	println(obj.absMethod())
}










