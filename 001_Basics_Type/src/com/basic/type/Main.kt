package com.basic.type

fun main(args: Array<String>) {
	f_007_Ranges()
}

fun f_001_Num(){
	val a: Int = 1000
	val d: Double = 100.00
	val f: Float = 100.100f
	val l: Long = 100000004
	val s: Short = 10
	val b: Byte = 1

	println("Your int value is " + a)
	println("Your double value is " + d)
	println("Your float value is " + f)
	println("Your long value is " + l)
	println("Your short value is " + s)
	println("Your byte value is " + b)
}

fun f_002_Char(){
	val letter : Char
	letter = 'A'
	println("$letter")
}

fun f_003_Bool(){
	val letter : Boolean
	letter = true
	println("Your boolean is $letter")
}

fun f_004_String(){
	var rawStr : String = "I'm raw\n"
	val escapedStr : String = "I'm escaped Str"
	println("Hello! $rawStr")
	println("Hey! $escapedStr")
}

fun f_005_Array(){
	val numbers : IntArray = intArrayOf(0, 1, 2, 3)
	println(numbers[2])
}

fun f_006_Collections_1(){
	val numbers : MutableList<Int> = mutableListOf(0, 1, 2, 3)
	val readOnly : List<Int> = numbers
	println("My mutable = $numbers")
	numbers.add(4)
	println("My mutable = $numbers")
	println("readOnly = $readOnly")
}

fun f_006_Collections_2(){
	val items = listOf(0, 1, 2, 3, 4)
	println("First element " + items.first())
	println("Last element " + items.last())
	
	println("Even element " + items.filter { it % 2 == 0 })
	
	val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
	println(readWriteMap["foo"])
	
	val strings = hashSetOf("phong", "phong", "OK")
	println("My set $strings")
 }

fun f_007_Ranges(){
	val i : Int = 2
	for(j in 1..4){
		print(j)
	}
	
	if(i in 1..10){
		println("We found your number $i")
	}
}