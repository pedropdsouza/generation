fun main(){
    var idade = 0
    var p21 = 0
    var p50 = 0

    while (idade != -99){

        print("Digite uma idade: ")
        idade = readln().toInt()

        if (idade != -99){

            if (idade < 21){
                p21++
            } else if (idade > 50){
                p50++
            }
        }
    }

    println("O número de pessoas menores de 21 anos de idade é $p21")
    println("O número de pessoas maiores de 50 anos de idade é $p50")
}