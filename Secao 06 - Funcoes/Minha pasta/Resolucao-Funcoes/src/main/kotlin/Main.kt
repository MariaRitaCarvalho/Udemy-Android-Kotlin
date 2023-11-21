/*
fun qtdC(stg: String): Int {
    return stg.length
} //2

fun calculoCubo(n: Int) {
    println(n*n*n)
} //3

fun convertM(milhas: Float) {
    println("${milhas * 1.6f} km")
} //4

fun main() {
    println(qtdC("carrinho de madeira"))

    calculoCubo(9)

    convertM(4f)
}
*/

fun converter(anos: Int) {
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 8760} horas")
    println("${anos * 525600} minutos")
    println("${anos * 31536000} segundos")
} //1

fun qtdC(stg: String) = stg.length //6

fun calculoCubo(n: Int) = n*n*n //6

fun convertMi(milhas: Float) = milhas * 1.6f //6

fun trocaDeL(palavra: String){
    println(palavra.replace('a','x', true).uppercase())
} //5

fun main() {
    val anos = 2
    println("$anos anos equivalem a:")
    converter(anos)

    println(qtdC("carrinho de madeira"))

    println(calculoCubo(9))

    println("${convertMi(3f)} km")

    trocaDeL("abacaxi")
}