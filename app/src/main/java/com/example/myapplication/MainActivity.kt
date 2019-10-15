package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.EmailAdapter
import com.example.myapplication.model.Email

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fakeEmails = generateFakeEmails()
        setUpEmailRecyclerView(fakeEmails)
    }

    private fun setUpEmailRecyclerView(emails: List<Email>) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val emailRecyclerView = findViewById<RecyclerView>(R.id.recycle_id)
        val recyclerAdapter = EmailAdapter(emails, this)
        emailRecyclerView.layoutManager = layoutManager
        emailRecyclerView.adapter = recyclerAdapter
    }

    private fun generateFakeEmails(): List<Email> {
        val titles = listOf(
            "Kotlin making me lost!",
            "Devs struggling.",
            "What is new :/",
            "But some say that Kotlin is way better")
        val descriptions = listOf(
            "I am really sorry...",
            "Another text...",
            "Follow our blog to learn more...",
            "Let's see..")
        val times = listOf(
            "01:42",
            "04:16",
            "01:34",
            "02:20")
        val emailList = mutableListOf<Email>()
        for (i in 0..20) {
            emailList.add(
                Email(titles.random(), descriptions.random(), times.random())
            )
        }
        return emailList
    }
}
