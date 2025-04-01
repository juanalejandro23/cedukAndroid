package com.ceduk.myapp.firstApp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ceduk.myapp.R

class fisrtAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fisrt_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val loginButton: Button = findViewById(R.id.buttonLogin)
        val etName = findViewById<EditText>(R.id.inputTextName)
        val etPass = findViewById<EditText>(R.id.inputTextPass)

        loginButton.setOnClickListener {
            val usuario = etName.text.toString()
            val password = etPass.text.toString()

            if (validarCredenciales(usuario, password)){
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validarCredenciales(usuario: String, password: String): Boolean{
        val usuarioValido = "admin"
        val passValido = "1234"
        return usuario == usuarioValido && password == passValido;
    }
}