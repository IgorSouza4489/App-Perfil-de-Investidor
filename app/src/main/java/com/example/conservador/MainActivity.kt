package com.example.conservador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.conservador.databinding.ActivityMainBinding
import com.example.conservador.databinding.ActivityPerguntasBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.iniciar.setOnClickListener{
            if(binding.tvinput.text.isEmpty()){
                Toast.makeText(this, "Preencha o campo nome", Toast.LENGTH_SHORT).show()
            }
            else{
                var user = User()
                user.nome = binding.tvinput.text.toString()
                var intent = Intent(this, Perguntas::class.java)
                intent.putExtra("nome", user)
                startActivity(intent)

            }
        }
    }
}