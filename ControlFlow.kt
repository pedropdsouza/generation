import kotlin.reflect.typeOf

fun main () {
    print("Digite o primeiro número: ")
    val prim = readln().toInt()

    var maior = prim

    print("Digite o segundo número: ")
    val seg = readln().toInt()

    print("Digite o terceiro número: ")
    val terc = readln().toInt()

    if (seg > prim && seg > terc){
        maior = seg
    } else if (terc > prim) {
        maior = terc
    }

    println("O maior número inserido é: $maior")
}
