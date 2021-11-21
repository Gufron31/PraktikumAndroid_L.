package com.example.praktikumandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val nameTextView = findViewById<TextView>(R.id.namaEditText)
        val emailTextView = findViewById<TextView>(R.id.emailEditText)

        val name = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val jumlahsks = intent.getStringExtra("jumlah_sks", 0)

        nameTextView.setText(name)
        emailTextView.setText(email)

    }
}