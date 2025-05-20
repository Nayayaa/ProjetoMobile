package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Perguntas10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas10)

        val radioGroupTrabalha = findViewById<RadioGroup>(R.id.radioGroupTrabalha)
        val layoutPerguntaMunicipio = findViewById<LinearLayout>(R.id.layoutPerguntaMunicipio)
        val btnProximo = findViewById<Button>(R.id.btnProximo)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // Mostrar ou ocultar a segunda pergunta com base na resposta
        radioGroupTrabalha.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioSim -> layoutPerguntaMunicipio.visibility = View.VISIBLE
                R.id.radioNao -> layoutPerguntaMunicipio.visibility = View.GONE
            }
        }

        btnProximo.setOnClickListener {
            if (radioGroupTrabalha.checkedRadioButtonId == -1) {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_SHORT).show()
            } else {
                // Ir para a próxima página (Perguntas10_1)
                val intent = Intent(this, Perguntas10_1::class.java)
                startActivity(intent)
            }
        }

        btnVoltar.setOnClickListener {
            // Voltar para a tela anterior (Perguntas9)
            val intent = Intent(this, Perguntas9::class.java)
            startActivity(intent)
            finish() // Finaliza esta tela
        }
    }
}
