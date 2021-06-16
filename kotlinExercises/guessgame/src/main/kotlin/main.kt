fun main(args: Array<String>) {
	val n = 10;

	do {
		print("Guess a number: ");
		val guess = readLine()!!.toInt();

		if (guess == n)
			println("You nailed it!");
		else if (guess > n)
			println("Less!");
		else
			println("More!");
	} while(guess != n);
}