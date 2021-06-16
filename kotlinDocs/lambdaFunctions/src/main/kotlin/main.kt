fun main() {
	val list = listOf("kotlin", "is", "fun")
	/*
	* The last line of a lambda function will be returned
	* parameters: it: String or someVar ->
	*/
	val count = list.count { currentString ->
		currentString.length == 3
	}
	println("Result of count $count")

	val count2 = list.customCount {
		it.length >= 3 // it could be replaced with someName ->
	}
	println("Result of count2 $count2")
}

/*
* custom lambda function */
fun List<String>.customCount(function: (String) -> Boolean): Int {
	var counter = 0
	for (string in this) {
		if (function(string)) {
			counter++
		}
	}
	return counter
}