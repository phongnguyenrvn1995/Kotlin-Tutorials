package com.inheritence

open class ACB(val name: String) {
	open fun think() {
		println("Hey! I'm thinking, $name said")
	}
}

class BCD(val n: String) : ACB(n) {
	override fun think() {
		println("Hey! I need not think, $name said")
	}
}

fun main(args : Array<String>){
	val bcd = BCD("PHONG");
	bcd.think()
}