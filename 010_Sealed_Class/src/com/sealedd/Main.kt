package com.sealedd

sealed class MyExample {
	class OP1 : MyExample()
	class OP2 : MyExample()
}

class A : MyExample()

fun main(args: Array<String>) {
	val obj: MyExample = MyExample.OP2()
	val output = when (obj) {
		is MyExample.OP1 -> "Option 1"
		is MyExample.OP2 -> "Option 2"
		is A -> "A"
	}
	print(output)
}