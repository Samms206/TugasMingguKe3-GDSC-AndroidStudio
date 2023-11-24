package com.example.tugasminggu3

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val username = intent.getStringExtra("USER")
        val password = intent.getStringExtra("PASS")

        val user = findViewById<TextView>(R.id.tv_username)
        val pass = findViewById<TextView>(R.id.tv_password)
        user.text = "Username : $username"
        pass.text = "Password : $password"

        val back = findViewById<ImageView>(R.id.img_arrowback)
        back.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, HomeActivity::class.java).also {
                it.putExtra("USER", username)
                it.putExtra("PASS", password)
                startActivity(it)
            }
        })

        val keluar = findViewById<Button>(R.id.btn_keluar)
        keluar.setOnClickListener(View.OnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Konfirmasi")
            dialog.setMessage("Anda yakin ingin keluar?")
            dialog.setPositiveButton("Ya", DialogInterface.OnClickListener { _, _ ->
                val intent = Intent(this, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                finish()
            })
            dialog.setNegativeButton("Tidak", DialogInterface.OnClickListener { _, _ ->
                // return null
            })
            dialog.show()
        })
    }
}