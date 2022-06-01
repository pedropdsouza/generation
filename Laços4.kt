fun main(){
    var cont = 0
    var idade = 0
    var sexo = 0
    var opcao = 0
    var pCalmas = 0
    var mNerv = 0
    var hAgr = 0
    var outCalmos = 0
    var pNM40 = 0
    var pCM18 = 0

    while (cont < 6) {

        println("***Pessoa ${cont + 1}***")

        println("Digite a idade: ")
        idade = readln().toInt()

        println("Digite o sexo (1- Feminino / 2- Masculino / 3- Outros): ")

        println("Digite o comportamento " +
        "\n(1, se a pessoa era calma; 2, se a pessoa era nervosa; 3, se a pessoa " +
        "era agressiva")
        opcao = readln().toInt()

        if (opcao == 1){
            pCalmas++
        }

        if (sexo == 1 && opcao == 2){
            mNerv++
        }

        if (sexo == 2 && opcao == 3){
            hAgr++
        }

        if (sexo == 3 && opcao == 1){
            outCalmos++
        }

        if (opcao == 2 && idade > 40){
            pNM40++
        }

        if (opcao == 1 && idade < 18){
            pCM18++
        }

        cont++
    }

    println("O número de pessoas calmas: $pCalmas")
    println("O número de mulheres nervosas: $mNerv")
    println("O número de homens agressivos: $hAgr")
    println("O número de outros calmos: $outCalmos")
    println("O número de pessoas nervosas com mais de 40 anos: $pNM40")
    println("O número de pessoas calmas com menos de 18 anos: $pCM18")
}