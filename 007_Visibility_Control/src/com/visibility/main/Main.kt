package com.visibility.main

import com.visibility.control.InternalExample
import com.visibility.control.PublicExample

fun main(args: Array<String>) {
	val obj : PublicExample = PublicExample()
	obj.doSomething()
}