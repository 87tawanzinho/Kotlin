class Pessoa(val anoNascimento: Int, var nome: String) {

    var doc: String = "" // in class, we need a default value

    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) // the object
    {
    this.doc = doc
        if(doc == "") {
            println("set a doc pls")
        }
}
    val eyes = "blue"

    fun dormir () {
    println("I'm Sleeping.. Zzzz")
    }

    fun acordar() {
    println("I'm wake up now.")
    }
}
class Animal (var especie: String) {
    var speak: String = ""
    init {
    speak = if (especie == "dog") {
        "au"
    } else if (especie == "cat") {
        "meown"
    } else {
        ""
    }

              }
    fun speaker () {
        println(speak)

    }
}
class Vazia private constructor() // no access to her
fun main() {
    Animal("dog").speaker()
}

