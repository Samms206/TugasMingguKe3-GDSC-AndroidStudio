package com.example.tugasminggu3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("USER")
        val password = intent.getStringExtra("PASS")
        val value = "Selamat Datang $username"
        val greting = findViewById<TextView>(R.id.tv_home).apply {
            text = value
        }

        val btn_profile = findViewById<ImageView>(R.id.img_profile)
        btn_profile.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ProfileActivity::class.java).also {
                it.putExtra("USER", username)
                it.putExtra("PASS", password)
                startActivity(it)
            }
        })
    }
}