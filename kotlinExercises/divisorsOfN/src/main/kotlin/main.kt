fun divisorsOf(n: Int): Int {
	var divisors = 1

	for (i in 2..n/2) {
		if (n % i == 0)
			divisors++
	}
	return ++divisors
}

fun main() {
	val n = readLine()!!.toInt()

	println(divisorsOf(n))
}