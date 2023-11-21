/* Questão 1
fun bonus(cargo: String) {
    if (cargo == "Gerente"){
        println("Gerentes: Recebem R$ 2.000,00")
    } else if (cargo == "Coordenador") {
        println("Coordenadores: Recebem R$ 1.500,00")
    } else if (cargo == "Engenheiro de Software") {
        println("Engenheiros de Software: Recebem R$ 1.000,00")
    } else println("Estagiários: Recebem R$ 500,00")
}

fun main () {
    println("Empresa XPTO")
    println("Bônus que cada cargo irá ganhar!")

    bonus("Estagiário")
    bonus("Engenheiro de Software")
    bonus("Coordenador")
    bonus("Gerente")
}*/

// Questão 2
fun bonus(cargo: String, experiencia: Int = 0) {
    if (cargo == "Gerente"){
        if (experiencia < 2) {
            println("Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00")
        } else println("Gerentes com mais de 2 anos de experiência recebem R$ 3.000,00")
    } else if (cargo == "Coordenador") {
        if (experiencia < 1) {
            println("Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00")
        } else println("Coordenadores com mais de 1 ano de experiência recebem R$ 1.800,00")
    } else if (cargo == "Engenheiro de Software") {
        println("Engenheiros de Software recebem R$ 1.000,00")
    } else println("Estagiários recebem R$ 500,00")
}

fun main () {
    println("Empresa XPTO")
    println("Bônus que cada cargo irá ganhar!")

    bonus("Estagiário")
    bonus("Engenheiro de Software")
    bonus("Coordenador")
    bonus("Coordenador",2)
    bonus("Gerente",1)
    bonus("Gerente",3)
}

/* Questão 3
(a && b && c && d)
false && false && true && true
false

(!a && !b && (c && d))
true && true && true
true

(a && ((b || c) || d)
false && ((false || true) || true)
false && (false && true)
false

(a || ((!b && c) || !d))
false || (true || false)
false || true
true
*/