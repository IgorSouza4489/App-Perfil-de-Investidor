package com.example.conservador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.navArgs
import com.example.conservador.databinding.ActivityPerguntasBinding
import com.example.conservador.databinding.ActivityResultadoBinding


lateinit var binding2: ActivityResultadoBinding

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityResultadoBinding.inflate(layoutInflater)
        val view = binding2.root
        setContentView(view)

        var pontos = intent.getSerializableExtra("pontos")
        var pontuacao:Int = pontos as Int
        //var user = intent.getSerializableExtra("nome") as User
        //var nome = user.nome
        //var user = intent.getSerializableExtra("resultado")
        //var fragment = nonapergunta()
        // pontos = fragment.args.pontos

        if (pontos <= 12){
            binding2.Resultado.text = "Conservador"
        }
        else if (pontos in 13..29){
            binding2.Resultado.text = "Moderado"
        }
        else{
            binding2.Resultado.text = "Arrojado"
        }

        //binding2.Resultado.text = pontuacao.toString()
        //binding2.none.text = nome.toString()
       // binding2.none.text = user.toString()







    }

}