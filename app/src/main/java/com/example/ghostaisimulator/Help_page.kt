package com.example.ghostaisimulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Help_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_page)

        val setupButton: Button = findViewById(R.id.setup_button)
        setupButton.setOnClickListener {
            val intent = Intent(this@Help_page, setup_screen::class.java)
            startActivity(intent)
        }

        val configureButton: Button = findViewById(R.id.configure_button)
        configureButton.setOnClickListener {
            val intent = Intent(this@Help_page, configure_screen::class.java)
            startActivity(intent)
        }

        val usingButton: Button = findViewById(R.id.using_button)
        usingButton.setOnClickListener {
            val intent = Intent(this@Help_page, using_the_app_screen::class.java)
            startActivity(intent)
        }
    }
}
