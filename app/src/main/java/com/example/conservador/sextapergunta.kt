package com.example.conservador

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
import com.example.conservador.databinding.FragmentQuintaperguntaBinding
import com.example.conservador.databinding.FragmentSextaperguntaBinding

class sextapergunta : Fragment() {

    private var _binding: FragmentSextaperguntaBinding? = null
    private val binding get() = _binding!!
    val args : sextaperguntaArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSextaperguntaBinding.inflate(inflater, container, false)
        binding.back6?.setOnClickListener{
            findNavController().popBackStack()
        }
        val view = binding.root
        //binding.ponto?.text = args.pontos.toString()
        binding.btn6.setOnClickListener {
            val direction = sextaperguntaDirections

            if(binding.R6A.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma alternativa", Toast.LENGTH_LONG).show()
            }else {
                if (binding.Q6A.isChecked) {
                    val action = direction.actionSextaperguntaToSetimapergunta(args.pontos + 0)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q6B.isChecked) {
                    val action = direction.actionSextaperguntaToSetimapergunta(args.pontos + 2)
                    Navigation.findNavController(view).navigate(action)

                }
                else if (binding.Q6C.isChecked) {
                    val action = direction.actionSextaperguntaToSetimapergunta(args.pontos + 3)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q6D.isChecked) {
                    val action = direction.actionSextaperguntaToSetimapergunta(args.pontos + 4)
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
