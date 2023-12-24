class Pessoa(val anoNascimento: Int, var nome: String) {

}

fun main() {
    var pessoa: Pessoa = Pessoa(1996, "tawan")

    pessoa.nome // access attributes
}

