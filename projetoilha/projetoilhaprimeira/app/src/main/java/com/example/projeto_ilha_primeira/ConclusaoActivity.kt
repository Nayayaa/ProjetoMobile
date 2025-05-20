package com.example.projeto_ilha_primeira

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConclusaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conclusao)

        val btnRetornarInicio = findViewById<Button>(R.id.btnRetornarInicio)

        btnRetornarInicio.setOnClickListener {
            val intent = Intent(this, Telainicial::class.java) // redireciona para TelaInicial
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
