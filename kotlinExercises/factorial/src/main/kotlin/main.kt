fun main(args: Array<String>) {
	val n = readLine()!!.toInt()

	println("Factorial of $n is ${factorial(n)}")
	println("Sum until $n is ${sumUntil(n)}")
}

fun factorial(n: Int): Long {
	if (n == 1)
		return 1
	return n * factorial(n-1)
}

fun sumUntil(n: Int): Long {
	var sum: Long = 0

	for (i in 1..n)
		sum += i
	return sum
}
