package com.example.conservador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.conservador.databinding.ActivityMainBinding
import com.example.conservador.databinding.ActivityPerguntasBinding

lateinit var binding1: ActivityPerguntasBinding

class Perguntas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding1 = ActivityPerguntasBinding.inflate(layoutInflater)
        val view = binding1.root
        setContentView(view)
        var user = intent.getSerializableExtra("nome") as User
        var nome = user.nome
        binding1.Nome.text = nome






    }

    override fun onPause() {
        super.onPause()

        //var nU = User(user.nome)
        //intent = Intent(this, Resultado::class.java)
        //intent.putExtra("nome", nU)
        //startActivity(intent)
    }



}