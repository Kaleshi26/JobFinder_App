package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LaunchScreen4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen4)

        // Delay before moving to OnboardingScreen1 (e.g., 2 seconds)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnboardingScreen1::class.java)
            startActivity(intent)
            finish() // Close this activity so user can't go back
        }, 2000)
    }
}
