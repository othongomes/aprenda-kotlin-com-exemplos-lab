// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Aluno ${usuario.nome} matriculado na formação $nome")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    
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
