package exercicio

fun main(){

    while (true){

        println("Digite o seu nome: ")
        val nome = readln()

        println("Digite o seu endereço: ")
        val endereco = readln()

        println("Digite o seu telefone: ")
        val telefone = readln()

        try{

            val Pedro = Cliente(nome, endereco, telefone)

            while (true){

                println("\n***Menu***\n")

                println("1 - Adicionar Compras")
                println("2 - Remover Compras")
                println("3 - Listar Compras")
                println("4 - Sair\n")

                println("Opção: ")
                val opc = readln().toInt()

                when(opc){

                    1 -> {
                        println("Digite um item para adicionar no carrinho: ")
                        val compra = readln()
                        cliente.addCompra(compra)
                    }

                    2 -> {
                        println("Digite um item para ser removido: ")
                        val compra = readln()
                        cliente.removeCompra(compra)
                    }

                    3 -> {
                        cliente.listCompras()
                    }

                    4 -> break

                    else -> println("Valor Inválido!")
                }
            }
            break
        }catch(e: Exception){
            println(e.message)
        }
    }
}