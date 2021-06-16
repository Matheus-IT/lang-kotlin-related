import kotlin.random.Random

fun main() {
	/*
	* Escreva um programa que leia/gere um vetor vGab de
	*  10 elementos do tipo caractere que representa o
	* gabarito de uma prova. O vetor só aceita os caracteres
	*  'A', 'B', 'C', 'D' e 'E' maiúsculas. A seguir, para
	*  cada um dos 20 alunos da turma, leia o vetor vResp
	* com as 10 respostas do aluno e conte o número de acertos.
	* Mostre a quantidade de acertos do aluno e uma mensagem
	* “APROVADO”, se a nota for maior ou igual a 7.0; e
	* mostre uma mensagem de “REPROVADO”, caso contrário. */

	val testResult = mutableListOf<Char>()
	val testResp = mutableListOf<Char>()

	generate(testResult)
	for (i in 0 until 20) {
		generate(testResp)
		println(testResult.toString())
		println(testResp.toString())

		val grade = verifyAnswers(testResult, testResp)

		print("Student ${i+1} - $grade")
		if (grade >= 7)
			println(" passed the test :)")
		else
			println(" failed the test :(")
	}
}

fun generate(list: MutableList<Char>) {
	list.clear()
	for (i in 0 until 10)
		list.add((Random.nextInt(65,70).toChar()))
}

fun verifyAnswers(testResult: MutableList<Char>, testResp: MutableList<Char>): Int {
	var points = 0
	for (i in 0 until testResult.size) {
		if (testResult[i] == testResp[i])
			points++
	}
	return points
}