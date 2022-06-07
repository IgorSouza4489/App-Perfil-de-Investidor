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
import com.example.conservador.databinding.FragmentSetimaperguntaBinding
import com.example.conservador.databinding.FragmentSextaperguntaBinding

class setimapergunta : Fragment() {

    private var _binding: FragmentSetimaperguntaBinding? = null
    private val binding get() = _binding!!
    val args : setimaperguntaArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSetimaperguntaBinding.inflate(inflater, container, false)
        binding.back7?.setOnClickListener{
            findNavController().popBackStack()
        }
        val view = binding.root
        //binding.ponto?.text = args.pontos.toString()
        binding.btn7.setOnClickListener {
            val direction = setimaperguntaDirections

            if(binding.R7A.checkedRadioButtonId ==-1){
                Toast.makeText(context, "Selecione uma alternativa", Toast.LENGTH_LONG).show()
            }else {
                if (binding.Q7A.isChecked) {
                    val action = direction.actionSetimaperguntaToOitavapergunta(args.pontos + 0)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q7B.isChecked) {
                    val action = direction.actionSetimaperguntaToOitavapergunta(args.pontos + 2)
                    Navigation.findNavController(view).navigate(action)

                }
                else if (binding.Q7C.isChecked) {
                    val action = direction.actionSetimaperguntaToOitavapergunta(args.pontos + 3)
                    Navigation.findNavController(view).navigate(action)
                }
                else if (binding.Q7D.isChecked) {
                    val action = direction.actionSetimaperguntaToOitavapergunta(args.pontos + 4)
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
