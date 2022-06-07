package com.example.conservador

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.conservador.databinding.FragmentNonaperguntaBinding
import com.example.conservador.databinding.FragmentOitavaperguntaBinding

class nonapergunta : Fragment() {



    private var _binding: FragmentNonaperguntaBinding? = null
    private val binding get() = _binding!!
    val args : nonaperguntaArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNonaperguntaBinding.inflate(inflater, container, false)
        binding.back9?.setOnClickListener{
            findNavController().popBackStack()
        }
        val view = binding.root
        //binding.pontor?.text = args.pontos.toString()
        binding.btn9.setOnClickListener {
            val direction = nonaperguntaDirections

            if(binding.R9A.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma alternativa", Toast.LENGTH_LONG).show()
            }else {
                if (binding.Q9A.isChecked) {
                    val action = direction.actionNonaperguntaToRs2(args.pontos + 0)
                    Navigation.findNavController(view).navigate(action)

                }
                else if (binding.Q9B.isChecked) {
                    val action = direction.actionNonaperguntaToRs2(args.pontos + 1)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q9C.isChecked) {
                    val action = direction.actionNonaperguntaToRs2(args.pontos + 2)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q9D.isChecked) {
                    val action = direction.actionNonaperguntaToRs2(args.pontos + 4)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q9E.isChecked) {
                    val action = direction.actionNonaperguntaToRs2(args.pontos + 5)
                    Navigation.findNavController(view).navigate(action)
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


