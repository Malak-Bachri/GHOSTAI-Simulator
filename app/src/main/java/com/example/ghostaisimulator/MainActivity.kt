package com.example.ghostaisimulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            val intent = Intent(this@MainActivity, login_page::class.java)
            startActivity(intent)
        }

        val helpButton: Button = findViewById(R.id.help_button)
        helpButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Help_page::class.java)
            startActivity(intent)
        }
    }
}