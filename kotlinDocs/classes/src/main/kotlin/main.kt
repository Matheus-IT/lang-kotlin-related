fun main() {
	val dog = Dog() // This guy inherits from Animal
	dog.bark() // This guy inherits from Animal

	val cat = Cat("Peteca")
	cat.meow()

	val bear = object : Animal("Camembear") {
		override fun move() {
			println("Bear moving...")
		}
	}
	bear.move() // Bear is an anonymous class
}