package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Perguntas10_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas10_1)

        val trabalhaGroup = findViewById<RadioGroup>(R.id.trabalhaRadioGroup)
        val localTrabalhoGroup = findViewById<RadioGroup>(R.id.localTrabalhoRadioGroup)
        val btnProximo = findViewById<Button>(R.id.btnProximo)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        trabalhaGroup.setOnCheckedChangeListener { _, checkedId ->
            val selecionado = findViewById<RadioButton>(checkedId)
            // Ação com base na resposta Sim/Não
        }

        localTrabalhoGroup.setOnCheckedChangeListener { _, checkedId ->
            val selecionado = findViewById<RadioButton>(checkedId)
            // Ação com base no local de trabalho
        }

        btnProximo.setOnClickListener {
            // Ir para Perguntas11
            val intent = Intent(this, Perguntas11::class.java)
            startActivity(intent)
        }

        btnVoltar.setOnClickListener {
            // Voltar para Perguntas10
            val intent = Intent(this, Perguntas10::class.java)
            startActivity(intent)
            finish()
        }
    }
}
