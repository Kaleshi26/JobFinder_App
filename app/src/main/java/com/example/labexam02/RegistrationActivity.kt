package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val tvSignIn = findViewById<TextView>(R.id.tvSignIn)

        btnRegister.setOnClickListener {
            // You can add logic here to handle registration (validation, data saving, etc.)
            // Then navigate to SignInActivity
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        tvSignIn.setOnClickListener {
            // Navigate to SignInActivity if the user clicks on "Sign In" text (optional)
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
