package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LaunchScreen1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen1)

        // Navigate to the next screen after 2 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LaunchScreen2Activity::class.java)
            startActivity(intent)
            finish() // Close current activity
        }, 2000)
    }
}
