fun isPrime(n: Int): Boolean {
	for (i in 2 until n) {
		if (n % i == 0)
			return false;
	}
	return true;
}


fun main() {
	val n = 10;
	var cont = 2;
	var primes = 0;

	do {
		if (isPrime(cont)) {
			print("$cont ");
			cont++;
			primes++;
		} else {
			cont++;
		}
	} while(primes < n);
}
