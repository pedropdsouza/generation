fun main(){

    /* Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
     */

    val aviao = Aviao(
        turbina : 2,
        asas: 2,
        cor: "Azul",
        tremPouso: true,
        modelo: "Gol")

    aviao.pousar()

}