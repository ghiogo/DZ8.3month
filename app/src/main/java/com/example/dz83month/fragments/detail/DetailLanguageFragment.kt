package com.example.dz83month.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.dz83month.CatModel
import com.example.dz83month.R
import com.example.dz83month.databinding.FragmentDetailCatBinding
import com.example.dz83month.databinding.FragmentDetailCinemaBinding
import com.example.dz83month.databinding.FragmentDetailLanguageBinding


class DetailLanguageFragment : Fragment() {
    private lateinit var binding: FragmentDetailLanguageBinding
    private var model: CatModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailLanguageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnClose.setOnClickListener{
            findNavController().navigateUp()
        }
        data
    }
    private val data: Unit
        get(){
            val argument = arguments
            if (argument!= null){
                model = argument.getSerializable("key") as CatModel
                binding.imageLanguageDetail.let {
                    it.context.let { it1->
                        Glide.with(it1).load(model?.image).into(binding.imageLanguageDetail)
                    }
                }
                binding.txtLanguageDetail.text = model?.name
            }
        }
}