fun main() {
	val list1 = listOf("Kotlin", "is", "fun")
	val list2 = listOf( 3, 1, 2, 5, 6)

	printList(list1)
	printList(list2)
}

fun <E> printList(list: List<E>) {
	print("[")
	for (i in list.indices) {
		print(list[i])
		if (i != list.size-1)
			print(", ")
	}
	println("]")
}