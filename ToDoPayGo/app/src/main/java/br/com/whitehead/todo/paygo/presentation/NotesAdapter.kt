package br.com.whitehead.todo.paygo.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.whitehead.todo.paygo.R
import br.com.whitehead.todo.paygo.core.Notes

class NotesAdapter(private val notesList: List<Notes>) :
    RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return NotesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notesList.size
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.bind(notesList[position])
    }

    class NotesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(note: Notes) {
            val textTitle = itemView.findViewById<TextView>(R.id.textTitle)
            textTitle.text = note.title
            val textDescription = itemView.findViewById<TextView>(R.id.textDescription)
            textDescription.text = note.description
        }
    }
}