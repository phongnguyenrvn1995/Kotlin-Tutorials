package com.classs.objectt

interface Human{
	fun think()
}

fun main(args:Array<String>){
	var programer : Human = object:Human{
		override fun think() {
			print("I am an example of Anonymous Inner Class")
		}
	}
	
	var seller : Human = object:Human{
		override fun think() {
			print("I am an example of Anonymous Inner Class 1")
		}
	}
	
	programer.think()
	seller.think()
}