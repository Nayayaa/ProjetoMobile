package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Perguntas11 : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var btnProximo: Button
    private lateinit var btnVoltar: Button
    private lateinit var textRetornarInicio: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas11)

        radioGroup = findViewById(R.id.radioGroupReligiao)
        btnProximo = findViewById(R.id.btnProximo)
        btnVoltar = findViewById(R.id.btnVoltar)
        textRetornarInicio = findViewById(R.id.textRetornarInicio)

        btnProximo.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            if (selectedId != -1) {
                val resposta = findViewById<RadioButton>(selectedId).text.toString()
                Toast.makeText(this, "Resposta: $resposta", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Perguntas12::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Selecione uma opção.", Toast.LENGTH_SHORT).show()
            }
        }

        btnVoltar.setOnClickListener {
            val intent = Intent(this, Perguntas10_1::class.java)
            startActivity(intent)
            finish()
        }

        textRetornarInicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
