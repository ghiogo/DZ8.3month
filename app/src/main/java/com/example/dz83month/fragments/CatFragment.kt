package com.example.dz83month.fragments

import android.os.Bundle
import android.service.autofill.OnClickAction
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dz83month.CatModel
import com.example.dz83month.OnItemClickListener
import com.example.dz83month.R
import com.example.dz83month.repository.CatRepository
import com.example.dz83month.cat_adapter.CatAdapter
import com.example.dz83month.databinding.FragmentCatBinding

class CatFragment : Fragment(), OnItemClickListener {
    private var binding: FragmentCatBinding?= null
    private val listCat = mutableListOf<CatModel>()
    private val repo = CatRepository()
    private val adapter = CatAdapter(listCat, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCatBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.rvCats?.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        listCat.addAll(repo.getListOfCatHTTP())
        binding?.rvCats?.adapter= adapter

        binding?.btnBack?.setOnClickListener{
            findNavController().navigate(R.id.action_catFragment_to_edCatFragment3)
        }
    getData()
    }

    private fun getData() {
        val bundle = arguments
        if (arguments != null) {
            val text = bundle?.getString("cat2")
            listCat.add(CatModel("",text.toString()))
        }
    }

    override fun onClick(model: CatModel) {
        val bundle = Bundle()
        bundle.putSerializable("key", model)
       findNavController().navigate(R.id.action_catFragment_to_detailCatFragment, bundle)
            .toString()
    }

    override fun onLongClick(textModel: CatModel): Boolean {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
