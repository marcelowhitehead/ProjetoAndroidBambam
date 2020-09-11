package br.com.whitehead.todo.paygo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.whitehead.todo.paygo.R
import br.com.whitehead.todo.paygo.core.NotesUseCase
import kotlinx.android.synthetic.main.activity_notes.*

class NotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
        val notesUseCase = NotesUseCase()

        recyclerViewNotes.layoutManager = GridLayoutManager(this, 2)
        recyclerViewNotes.adapter = NotesAdapter(notesUseCase.getBambamNotes())
    }
}
