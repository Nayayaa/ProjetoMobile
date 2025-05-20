package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Telainicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial) // Alterei para garantir que esteja referenciando o layout correto

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            val intent = Intent(this, Perguntas1::class.java) // Alterei para direcionar para a tela da primeira pergunta
            startActivity(intent)
        }
    }
}