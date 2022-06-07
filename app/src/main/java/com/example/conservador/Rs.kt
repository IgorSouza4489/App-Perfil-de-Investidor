package com.example.conservador

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.conservador.databinding.FragmentRsBinding
import com.example.conservador.databinding.FragmentSextaperguntaBinding

class Rs : Fragment() {

    private var _binding: FragmentRsBinding? = null
    private val binding get() = _binding!!
    val args : RsArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRsBinding.inflate(inflater, container, false)

        val view = binding.root

        //binding.ponto?.text = args.pontos.toString()
        binding.botaofim.setOnClickListener {
            val direction = RsDirections

            val intent = Intent(activity, Resultado::class.java)
            intent.putExtra("pontos", args.pontos)
            activity!!.startActivity(intent)
        }
        return view
    }


}