abstract class Animal(
	public val name: String,
	val legCount: Int = 4
) {
	init {
		println("Animal created...")
		println("Name is $name")
	}
	abstract fun move()
}