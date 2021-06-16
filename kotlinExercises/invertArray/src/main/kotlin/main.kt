fun main() {
	val nums = arrayOf(5,6,1,9,4)

	printArray(nums)
	smallestItem(nums)
	printArray(nums)
}

fun printArray(arr: Array<Int>) {
	for (n in arr)
		print(n)
	println()
}

fun smallestItem(arr: Array<Int>) {
	var smallestIndex = 0

	for (i in arr.indices) {
		if (arr[i] < arr[smallestIndex])
			smallestIndex = i
	}
	val aux = arr[0]
	arr[0] = arr[smallestIndex]
	arr[smallestIndex] = aux
}