package cliente

class cliente (
    var nome: String,
    var endereco: String,
    var telefone: String
){

    private var listaDeCompras = mutableListOf<String>()

    //Métodos

    fun verificaNome(){
        try{
            val nome = readln().toString()
        }catch(e: Exception){
            println(e.message)
        }
    }


    fun adicionar(prod: String){
        if(prod != ""){
            listaDeCompras.add(prod)
            println("Produto $prod cadastrado.\n")
        }else{
            println("O nome do produto não pode ser vazio.")
        }

    }

    fun remover(deletado: String){
        if(listaDeCompras.contains(deletado)){
            listaDeCompras.remove(deletado)
            println("Produto $deletado removido com sucesso!")
        }else{
            println("Produto não existe na lista\n")
        }
    }

    private fun listar(){
        println("Lista de produtos\n")

        listaDeCompras.forEach{
            println(it)
        }

    }

}