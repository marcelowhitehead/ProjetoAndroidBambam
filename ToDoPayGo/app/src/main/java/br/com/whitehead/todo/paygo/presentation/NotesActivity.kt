package br.com.whitehead.todo.paygo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.whitehead.todo.paygo.R
import br.com.whitehead.todo.paygo.core.NotesUseCase

class NotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
    }
}
fun main(){
    val notesUseCase = NotesUseCase()
    println(notesUseCase.getBambamNotes())
}