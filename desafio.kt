// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Aluno ${usuario.nome} matriculado na formação $nome")
    }

    fun listarInscritos() {
        println("Alunos inscritos na formação $nome:")
        inscritos.forEachIndexed { index, aluno ->
            println("${index + 1}. ${aluno.nome}")
        }
    }
}

fun main() {
    val aluno1 = Usuario("João")
    val aluno2 = Usuario("Maria")
    val aluno3 = Usuario("Pedro")

    val conteudo1 = ConteudoEducacional("Introdução à Programação", 120)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 180)
    val conteudo3 = ConteudoEducacional("Banco de Dados", 150)

    val formacao = Formacao("Desenvolvimento Web", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))

    formacao.matricular(aluno1)
    formacao.matricular(aluno2)
    formacao.matricular(aluno3)

    formacao.listarInscritos()
}