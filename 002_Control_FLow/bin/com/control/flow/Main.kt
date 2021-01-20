package com.control.flow


fun main(args: Array<String>) {
	f_007_Continue_Break()
}

fun f_001_if_else() {
	val a: Int = 5
	val b: Int = 2
	var max: Int

	if (a > b) {
		max = a
	} else {
		max = b
	}

	println("Maximum of a or b is $max")
}

fun f_002_when_01() {
	val x: Int = 1
	when (x) {
		1 -> {
			println("x==1")
		}

		2 -> {
			println("x==2")
		}
		else -> {
			println("x is neither 1 nor 2")
		}
	}
}

fun f_002_when_02() {
	val x: Int = 5
	when (x) {
		1, 2 -> println("x is either 1, 2")
		else -> {
			println("x is neither 1 nor 2")
		}
	}
}

fun f_003_for_loop_01() {
	val items = listOf(1, 2, 3, 4)
	for (i in items)
		println("index $i")
}

fun f_003_for_loop_02() {
	val items = listOf(11, 22, 33, 44)
	for ((index, value) in items.withIndex()) {
		println("index = $index, value = $value")
	}
}

fun f_004_while_loop() {
	var x: Int = 0
	println("Example while loop")
	while (x <= 10) {
		println(x)
		x++
	}
}

fun f_005_do_while_loop() {
	var x: Int = 0
	do {
		x += 10
		println(x)
	} while (x <= 50)
}


fun f_006_Return(x: Int): Int {
	return x * x
}

fun f_007_Continue_Break() {
	println("Example of break & continue")
	myLable@ for (x in 1..10) {
		if (x == 5) {
			println("I am inside if block with value = $x hence it will close the operation")
			break@myLable
		} else {
			println("I am inside else block with value = $x")
			continue@myLable
		}
	}
}


