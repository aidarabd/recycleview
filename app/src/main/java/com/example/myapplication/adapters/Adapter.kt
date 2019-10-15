package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Email

class EmailAdapter(private val emailList: List<Email>, private val context: Context) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){
    override fun onBindViewHolder(emailViewHolder: EmailViewHolder, index: Int) {
        emailViewHolder.titleTextView.text = emailList[index].title
        emailViewHolder.descriptionTextView.text = emailList[index].details
        emailViewHolder.timeTextView.text = emailList[index].time
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        return EmailViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    inner class EmailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.title)
        val descriptionTextView: TextView = view.findViewById(R.id.detail)
        val timeTextView: TextView = view.findViewById(R.id.time)

    }
}