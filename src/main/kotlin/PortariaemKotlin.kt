fun main() { portaria() }

fun portaria() {

    print("Qual sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }
    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
        println("Negado. Convite inválido. ")
        return
    }
    print("Qual o código do convite? ")
    var codigo = readLine()

    if (codigo != null && codigo != "") {
        codigo = codigo.lowercase()

        if (tipoConvite == "comum" && codigo.startsWith(prefix = "xt")) {
            println("Welcome:) ")
        } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith(prefix = "xl")) {
            println("Welcome:) ")
        } else {
            println("Negado. Covite inválido. ")
        }

    }
}