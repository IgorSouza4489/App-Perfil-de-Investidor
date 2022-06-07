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
import com.example.conservador.databinding.FragmentPrimeirapergunta2Binding
import com.example.conservador.databinding.FragmentSegundaperguntaBinding

class segundapergunta : Fragment() {


    private var _binding: FragmentSegundaperguntaBinding? = null
    private val binding get() = _binding!!
    val args : segundaperguntaArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSegundaperguntaBinding.inflate(inflater, container, false)

        val view = binding.root
        //binding.ponto?.text = args.pontos.toString()
        binding.back?.setOnClickListener{
            findNavController().popBackStack()
        }
        binding.btn2.setOnClickListener {
            val direction = segundaperguntaDirections

            if(binding.R2A.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma alternativa", Toast.LENGTH_LONG).show()
            }else {
                if (binding.Q2A.isChecked) {
                    val action = direction.actionSegundaperguntaToTerceirapergunta(args.pontos)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q2B.isChecked) {
                    val action = direction.actionSegundaperguntaToTerceirapergunta(args.pontos + 2)
                    Navigation.findNavController(view).navigate(action)

                }
                else if (binding.Q2C.isChecked) {
                    val action = direction.actionSegundaperguntaToTerceirapergunta(args.pontos + 4)
                    Navigation.findNavController(view).navigate(action)

                }
                else if (binding.Q2D.isChecked) {
                    val action = direction.actionSegundaperguntaToTerceirapergunta(args.pontos + 5)
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

