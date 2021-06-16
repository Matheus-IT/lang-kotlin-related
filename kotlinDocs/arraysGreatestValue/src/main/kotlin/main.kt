fun main() {
	/*
	* Faça um programa que gere um vetor de 20 posições
	* de números inteiros e divida todos os seus elementos
	* pelo maior valor do vetor. Mostre o vetor após os
	* cálculos.*/

	val list1 = mutableListOf<Float>(5.0f,3.0f,8.0f,4.0f,9.0f,4.0f,7.0f)
	val greaterValue = list1.maxOrNull()?: 0 // in case of null, assign 0
	println(list1.toString())
	calc(list1, greaterValue.toFloat())
	println(list1.toString())
}

fun calc(list: MutableList<Float>, greaterValue: Float) {
	for (i in list.indices) {
		list[i] /= greaterValue
	}
}