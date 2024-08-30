fun main() {

//- QUESTÃO 4
    println("PORTARIA - EVENTO")

    print("Digite sua idade: ")
    val idade = readlnOrNull()?.toInt()

    if (idade != null) {
        if (idade >= 18) {
            print("Digite seu tipo de convite: ")
            val convite = readlnOrNull()?.lowercase()

            if (convite != null) {
                funcaoConvite(convite)

                print("Digite o código do convite: ")
                val codigo = readlnOrNull()?.uppercase()
                if (codigo != null) {
                    funcaoCodigo(codigo)
                }
            }
        } else println("Negado. Menores de idade não são permitidos.")
    }
}

fun funcaoConvite(conviteParam: String) {
    if (conviteParam != "comum") {
        if (conviteParam != "premium") {
            if (conviteParam != "luxo") {
                return println("Negado. Convite inválido.")
            }
        }
    }
}

fun funcaoCodigo(codigoConvite: String) {
    return if (codigoConvite.startsWith("XT") || codigoConvite.startsWith("XL")) {
        println("Welcome :)")
    } else println("Negado. Código inválido.")
}

/*fun main() {

- QUESTÃO 1

    println("QUADRADO")
    print("Digite o valor do primeiro lado: ")
    val num1q = readLine()
    print("Digite o valor do segundo lado: ")
    val num2q = readLine()

    if (num1q == num2q) println("É um quadrado!") else println("Não é um quadrado!")


- QUESTÃO 2

    println("TRIÂNGULO")
    print("Digite o valor do primeiro lado: ")
    val num1t = readLine()
    print("Digite o valor do segundo lado: ")
    val num2t = readLine()
    print("Digite o valor do terceiro lado: ")
    val num3t = readLine()

    when ((num1t == num2t) && (num1t == num3t)) {
        true -> println("É um triângulo equilátero!")
        false -> println("Não é um triângulo equilátero!")
    }
}


- QUESTÃO 3

Segunda string
Terceira string

*/