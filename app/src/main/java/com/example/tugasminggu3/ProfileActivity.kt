package com.example.tugasminggu3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val username = intent.getStringExtra("USER")
        val password = intent.getStringExtra("PASS")
        Toast.makeText(this,"$username dan $password", Toast.LENGTH_SHORT).show()
    }
}