import kotlin.math.pow

fun main() {

    print("Digite o valor do diametro da circunferencia: ")
    var diametro = readln().toDouble()

    var raio = diametro/2

    var area = Math.PI * raio.pow(2)

    var comprimento = 2 * Math.PI * raio

    println("O valor da area desta circunferencia é: $area")

    println("O valor do comprimento desta circunferencia é: $comprimento")

}