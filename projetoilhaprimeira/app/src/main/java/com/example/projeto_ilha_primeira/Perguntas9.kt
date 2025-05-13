// Perguntas9.kt
package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Perguntas9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas9)

        val alfabetizadosSpinner = findViewById<Spinner>(R.id.spinnerAlfabetizados)
        val options = listOf("Selecione o número:", "1", "2", "3", "4", "5", "6", "7+")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        alfabetizadosSpinner.adapter = adapter

        alfabetizadosSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                if (position > 0) {
                    Toast.makeText(this@Perguntas9, "Selecionado: ${options[position]}", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        val escolarRadioGroup = findViewById<RadioGroup>(R.id.radioGroupEscolaridade)
        escolarRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioSim -> Toast.makeText(this, "Sim", Toast.LENGTH_SHORT).show()
                R.id.radioNaoMasFrequentou -> Toast.makeText(this, "Não, mas já frequentou", Toast.LENGTH_SHORT).show()
                R.id.radioNuncaFrequentou -> Toast.makeText(this, "Nunca frequentou", Toast.LENGTH_SHORT).show()
            }
        }

        val btnProximo = findViewById<Button>(R.id.btnProximo)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnProximo.setOnClickListener {
            val intent = Intent(this, Perguntas10::class.java)
            startActivity(intent)
        }

        btnVoltar.setOnClickListener {
            val intent = Intent(this, Perguntas8::class.java)
            startActivity(intent)
        }
    }
}
