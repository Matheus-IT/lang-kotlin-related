import kotlin.math.sqrt;

fun isPrime(n: Int): Boolean {
    val rootOfN = sqrt(n.toDouble()).toInt();

    for (i in 2 until rootOfN) {
        if (n % i == 0)
            return false;
    }
    return true;
}

fun main() {
    val n = readLine()!!.toInt();

    if (isPrime(n))
        println("Prime");
    else
        println("Not prime");
}