package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardingScreen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_screen_1)

        val skipButton: TextView = findViewById(R.id.skipButton)
        val nextButton: ImageView = findViewById(R.id.nextButton)

        // Skip button to jump to OnboardingScreen2
        skipButton.setOnClickListener {
            val intent = Intent(this, OnboardingScreen2::class.java)
            startActivity(intent)
            finish()
        }

        // Next button to go to the next onboarding screen
        nextButton.setOnClickListener {
            val intent = Intent(this, OnboardingScreen2::class.java)
            startActivity(intent)
            finish()
        }
    }
}