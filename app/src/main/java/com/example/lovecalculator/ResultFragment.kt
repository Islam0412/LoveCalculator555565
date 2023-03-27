package com.example.lovecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lovecalculator.databinding.FragmentResultBinding
import com.example.lovecalculator.model.LoveModel


class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        result()
        initListener()
    }

    private fun initListener() {
     binding.btnTryAgain.setOnClickListener {
         findNavController().navigateUp()
     }
    }

    @SuppressLint("SetTextI18n")
    private fun result() {
        binding.apply {
            val result = arguments?.getSerializable("result") as LoveModel
            tvYou.text = result.fname
            tvMe.text = result.sname
            tvPercent.text = result.presenter + "%"
            tvResult.text = result.result
        }
    }
}