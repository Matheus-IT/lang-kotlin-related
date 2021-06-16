class Cat(name: String) : Animal(name) {
	fun meow() {
		println("Meow!!!")
	}

	override fun move() {
		println("Cat moving...")
	}
}