package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Perguntas1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas1)

        // Botão para ir para a próxima página: Perguntas2
        val nextButton = findViewById<Button>(R.id.btnNext)
        nextButton.setOnClickListener {
            val intent = Intent(this, Perguntas2::class.java)
            startActivity(intent)
        }

        // Botão para voltar para a tela inicial: Telainicial
        val backButton = findViewById<Button>(R.id.btnPrevious)
        backButton.setOnClickListener {
            val intent = Intent(this, Telainicial::class.java)
            startActivity(intent)
            finish() // Encerra Perguntas1 para não ficar na pilha
        }
    }
}
