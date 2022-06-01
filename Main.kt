fun main(){

    /*
    Companion Object - Atributos e métodos sem precisar instanciar uma classe;

    Objetos Anônimos - São objetos
     */


    while (true){

        println("\n***MENU***\n")

        println("1 - Adição")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Potência")
        println("6 - Raiz quadrada")
        println("7 - Sair\n")

        println("Digite uma operação: \n")
        val opc = readln().toInt()

        when(opc){

            1 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toInt()

                println("Digite o segundo valor: ")
                val n2 = readln().toInt()

                println("A soma entre $n1 e $n2 é ${Calculadora.soma(n1, n2)} ")
            }

            2 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toInt()

                println("Digite o segundo valor: ")
                val n2 = readln().toInt()

                println("A subtração entre $n1 e $n2 é ${Calculadora.sub(n1, n2)} ")
            }

            3 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toInt()

                println("Digite o segundo valor: ")
                val n2 = readln().toInt()

                println("A multiplicação entre $n1 e $n2 é ${Calculadora.mult(n1, n2)} ")
            }

            4 -> {
                println("Digite o primeiro valor: ")
                val n1 = readln().toDouble()

                println("Digite o segundo valor: ")
                val n2 = readln().toDouble()

                println("A divisão entre $n1 e $n2 é ${Calculadora.divisao(n1, n2)} ")
            }

            5 -> {
                println("Digite o valor da base: ")
                val n1 = readln().toDouble()

                println("Digite o valor do expoente: ")
                val n2 = readln().toDouble()

                println("A potência de $n1 no expoente $n2 é ${Calculadora.potencia(n1, n2)} ")
            }

            6 -> {
                println("Digite um valor para calcular a raiz quadrada: ")
                val num = readln().toDouble()

                println("A raiz quadrada de $num é ${Calculadora.raizQuadrada(num)} ")
            }

            7 -> break

            else -> println("Opção Inválida!")

        }

    }

}