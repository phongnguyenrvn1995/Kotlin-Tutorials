package com.dataa.classes

data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args: Array<String>) {
	val book : Book = Book("name", "publisher", 4)
	println("Name ${book.name}")
	println("Name ${book.publisher}")
	println("Name ${book.reviewScore}")
	book.reviewScore = 9
	println("Name ${book.reviewScore}")
	
	println(book.toString())
	println(book.hashCode())
}