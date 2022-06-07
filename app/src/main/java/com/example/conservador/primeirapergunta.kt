package com.example.conservador

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.conservador.databinding.FragmentPrimeirapergunta2Binding


class primeirapergunta : Fragment() {

     private var _binding: FragmentPrimeirapergunta2Binding?=null
     private val binding get()= _binding!!

    val args : segundaperguntaArgs by navArgs()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentPrimeirapergunta2Binding.inflate(inflater, container, false)
        val view = binding.root
        var pontos:Int = 0
        val data = arguments

        binding.btn1.setOnClickListener {
            val direction = primeiraperguntaDirections
            val AltA = 0
            val AltB = 2
            val AltC = 3
            val AltD = 4

            if(binding.R1A.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma alternativa", Toast.LENGTH_LONG).show()
            }else {
                if (binding.Q1A.isChecked) {
                    val action = direction.actionPrimeiraperguntaToSegundapergunta2(AltA)
                    findNavController(view).navigate(action)
                }
                else if (binding.Q1B.isChecked) {
                    val action = direction.actionPrimeiraperguntaToSegundapergunta2(AltB)
                    findNavController(view).navigate(action)
                }
                else if (binding.Q1C.isChecked) {
                    val action = direction.actionPrimeiraperguntaToSegundapergunta2(AltC)
                    findNavController(view).navigate(action)

                }
                else if (binding.Q1D.isChecked) {
                    val action = direction.actionPrimeiraperguntaToSegundapergunta2(AltD)
                    findNavController(view).navigate(action)

                }
            }
            //if(binding.R1A.checkedRadioButtonId ==-1){
           //     Toast.makeText(context, "Selecione uma alternativa", Toast.LENGTH_LONG).show()
            //}else{
            //when (binding.R1A) {
            //    binding.Q1A -> direction.actionPrimeiraperguntaToSegundapergunta2(pontoA)
            //    binding.Q1B -> pontos += 2
            //    binding.Q1C -> pontos += 2
            //    binding.Q1D -> pontos += 2


            //}
            //    Navigation.findNavController(view).navigate(R.id.segundapergunta)
            //}


        }
        return view

    }
}





