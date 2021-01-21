package com.visibility.control

class InternalExample{
	internal val i = 1
	internal fun doSomething(){
		println("doSomething")
	}
}

fun main(args: Array<String>) {
	val obj : InternalExample = InternalExample()
	println(obj.i)
	obj.doSomething()
}