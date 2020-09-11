package br.com.whitehead.todo.paygo.core

object BambamNote {
    fun generate(): List<Notes> {
       return listOf(
           Notes("kleber Bambam", "Está pequeno? Então vai dormir e vai comer, porra!"),
           Notes("kleber Bambam", "Birl!"),
           Notes("kleber Bambam", "Que não vai dar rapaz… Saí de casa, comi pra caralho, porra!"),
           Notes("Kleber Bambam", "É hora do show, o mutante chegou!!"),
           Notes("Kleber Bambam", "Aqui é bodybuilder, porra!"),
           Notes("Kleber Bambam", "Tá saindo da jaula o monstro... BIRL!")
        )
    }
}

