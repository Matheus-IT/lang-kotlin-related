fun main() {
	val shoppingList = listOf<String>("mouse", "keyboard", "monitor")
	println("Immutable List: ${shoppingList[0]}, ${shoppingList[1]}, ${shoppingList[2]}")

	val dreamList = mutableListOf<String>("Lamborghini", "Penthouse", "Rolex")
	dreamList.add("Ferrari")
	printList<String>(dreamList)
}

fun <E> printList(list: List<E>) {
	print("[")
	for (i in list.indices) {
		print("${i+1}.${list[i]}")
		if (i != list.size-1)
			print(", ")
	}
	println("]")
}