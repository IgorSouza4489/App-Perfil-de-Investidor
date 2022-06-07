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
import com.example.conservador.databinding.FragmentQuartaperguntaBinding
import com.example.conservador.databinding.FragmentSegundaperguntaBinding

class quartapergunta : Fragment() {


    private var _binding: FragmentQuartaperguntaBinding? = null
    private val binding get() = _binding!!
    val args : quartaperguntaArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuartaperguntaBinding.inflate(inflater, container, false)
        binding.back4?.setOnClickListener{
            findNavController().popBackStack()
        }
        val view = binding.root
        //binding.ponto?.text = args.pontos.toString()
        binding.btn4.setOnClickListener {
            val direction = quartaperguntaDirections
            if(binding.R4A.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma alternativa", Toast.LENGTH_LONG).show()
            }else {
                if (binding.Q4A.isChecked) {
                    val action = direction.actionQuartaperguntaToQuintapergunta(args.pontos)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q4B.isChecked) {
                    val action = direction.actionQuartaperguntaToQuintapergunta(args.pontos + 2)
                    Navigation.findNavController(view).navigate(action)

                }
                else if (binding.Q4C.isChecked) {
                    val action = direction.actionQuartaperguntaToQuintapergunta(args.pontos + 4)
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
