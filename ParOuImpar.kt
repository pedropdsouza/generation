import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Digite um número: ")
    val num = readln().toDouble()

    if(num % 2 == 0.0){
        println("O número $num é par e sua raíz quadrada é: ${
            "%.2f".format(sqrt(num))}")
    } else{
        println("O número $num é ímpar e seu valor elevado ao quadrado é: " +
                "${"%.2f".format(num.pow(2))}")
    }
}