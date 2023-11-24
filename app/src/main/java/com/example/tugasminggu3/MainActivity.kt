package com.example.tugasminggu3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.btn_login)
        login.setOnClickListener{
            callActivity()
        }
    }
    private fun callActivity(){
        val username = findViewById<TextInputEditText>(R.id.tf_username)
        val valueUser = username.text.toString()
        val password = findViewById<TextInputEditText>(R.id.tf_password)
        val valuePass = password.text.toString()

        if (valueUser == "samsul hadi" && valuePass == "220441100138"){
            val intent = Intent(this,HomeActivity::class.java).also {
                it.putExtra("USER", valueUser)
                it.putExtra("PASS", valuePass)
                startActivity(it)
            }
        }else{
            Toast.makeText(this,"Username / Password Salah", Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Username = samsul hadi dan Password = 220441100138", Toast.LENGTH_SHORT).show()
        }
    }
}