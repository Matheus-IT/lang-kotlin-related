fun main() {
	print("Enter the number: ")
	val n = readLine()!!.toInt()
	print("Enter the char: ")
	val ch = readLine().toString()

	line1(n, ch)
}

fun line1(n: Int, ch: String) {
	for (i in 0..2) {
		drawLine(n, ch)
		if (i != 2)
			println(n)
	}
}

fun drawLine(n: Int, ch: String) {
	for (i in 0 until n)
		print(ch)
	println()
}