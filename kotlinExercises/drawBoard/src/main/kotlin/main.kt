fun main() {
	print("Enter the order: ")
	val n = readLine()!!.toInt()

	print("Enter the character: ")
	val character = readLine()!!.toString()

	drawBoard(n, character)
}

fun drawBoard(n: Int, ch: String) {
	for (i in 0 until n) {
		for (j in 0 until n)
			print("$ch ")
		println()
	}
}