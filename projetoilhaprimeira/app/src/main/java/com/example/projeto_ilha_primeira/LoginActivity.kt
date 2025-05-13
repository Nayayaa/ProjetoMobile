package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val errorMessage = findViewById<TextView>(R.id.errorMessage)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                errorMessage.text = "Por favor, preencha todos os campos."
                errorMessage.visibility = TextView.VISIBLE
            } else if (!isValidLogin(email, password)) {
                errorMessage.text = "Email ou senha incorretos!"
                errorMessage.visibility = TextView.VISIBLE
            } else {
                errorMessage.visibility = TextView.GONE
                val intent = Intent(this, Telainicial::class.java)
                startActivity(intent)
                finish() // Encerra a tela de login para que o usuário não volte ao apertar "voltar"
            }
        }
    }

    private fun isValidLogin(email: String, password: String): Boolean {
        return email == "usuario@exemplo.com" && password == "123456"
    }
}
