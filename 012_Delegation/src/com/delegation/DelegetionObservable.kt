package com.delegation

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class User {
	var name: String by Delegates.observable("PHONG") { prp, old, new ->
		println("$prp -> $old -> $new")
	}
}

class Example {
	var p: String by Delegate()
}

class Delegate {
	operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
		return "$thisRef, thank you for delegating '${prop.name}' to me!"
	}

	operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
		println("$value has been assigned to '${prop.name} in $thisRef.'")
	}
}

fun main(args: Array<String>) {
	/*val user = User()
	for (i in 1..7)
		user.name = i.toString()*/
	val obj = Example()
	obj.p = "1"
	obj.p = "2"
	obj.p = "3"
	
	println(obj.p)
}