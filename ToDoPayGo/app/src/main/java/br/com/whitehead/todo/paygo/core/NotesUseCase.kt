package br.com.whitehead.todo.paygo.core

import java.util.*

class NotesUseCase {
    fun getBambamNotes(): List<Notes> {
        val bambamNotes: List<Notes> = BambamNote.generate()
        bambamNotes.forEachIndexed { index, notes ->
            bambamNotes[index].title = bambamNotes[index].title
                .replace(notes.title.first(), bambamNotes.elementAt(index).title.first().toUpperCase())
        }
        return bambamNotes
    }
}