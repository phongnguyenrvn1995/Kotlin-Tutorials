package com.classs.objectt

typealias MyList = MutableMap<Int, String>

fun main(args: Array<String>) {
	val list : MyList = hashMapOf()
	list.put(1, "PHONG")
	print(list)
}