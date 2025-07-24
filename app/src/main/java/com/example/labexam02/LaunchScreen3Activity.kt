package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LaunchScreen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen3)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LaunchScreen4Activity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}
