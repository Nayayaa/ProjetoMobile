// Perguntas8.kt
package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Perguntas8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas8)

        val visaoGroup = findViewById<RadioGroup>(R.id.radioGroupVisao)
        visaoGroup.setOnCheckedChangeListener { _, checkedId ->
            val resposta = when (checkedId) {
                R.id.radioVisao1 -> "Tem, não consegue de modo algum"
                R.id.radioVisao2 -> "Tem muita dificuldade"
                R.id.radioVisao3 -> "Tem alguma dificuldade"
                R.id.radioVisao4 -> "Não tem dificuldade"
                else -> ""
            }
            Toast.makeText(this, resposta, Toast.LENGTH_SHORT).show()
        }

        val audicaoGroup = findViewById<RadioGroup>(R.id.radioGroupAudicao)
        audicaoGroup.setOnCheckedChangeListener { _, checkedId ->
            val resposta = when (checkedId) {
                R.id.radioAudicao1 -> "Tem, não consegue de modo algum"
                R.id.radioAudicao2 -> "Tem muita dificuldade"
                R.id.radioAudicao3 -> "Tem alguma dificuldade"
                R.id.radioAudicao4 -> "Não tem dificuldade"
                else -> ""
            }
            Toast.makeText(this, resposta, Toast.LENGTH_SHORT).show()
        }

        val btnProximo = findViewById<Button>(R.id.btnProximo)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnProximo.setOnClickListener {
            startActivity(Intent(this, Perguntas9::class.java))
        }

        btnVoltar.setOnClickListener {
            startActivity(Intent(this, Perguntas7::class.java))
        }
    }
}