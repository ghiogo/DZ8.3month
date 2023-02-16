package com.example.dz83month.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.dz83month.CatModel
import com.example.dz83month.OnItemClickListener
import com.example.dz83month.R
import com.example.dz83month.databinding.FragmentCatBinding
import com.example.dz83month.databinding.FragmentDetailCatBinding

class DetailCatFragment : Fragment() {

    private lateinit var binding: FragmentDetailCatBinding
    private var model: CatModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailCatBinding.inflate(inflater, container, false)
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
                binding.imageCatDetail.let {
                    it.context.let { it1->
                        Glide.with(it1).load(model?.image).into(binding.imageCatDetail)
                    }
                }
                binding.txtCatDetail.text = model?.name
            }
        }
}