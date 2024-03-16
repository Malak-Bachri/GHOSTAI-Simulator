package com.example.ghostaisimulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val submitButton: Button = findViewById(R.id.login_now)
        submitButton.setOnClickListener {
            val intent = Intent(this@login_page, logfile_page::class.java)
            startActivity(intent)
        }
    }
}


