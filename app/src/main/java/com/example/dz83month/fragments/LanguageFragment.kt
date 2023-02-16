package com.example.dz83month.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dz83month.CatModel
import com.example.dz83month.OnItemClickListener
import com.example.dz83month.R
import com.example.dz83month.cat_adapter.LanguageAdapter
import com.example.dz83month.databinding.FragmentLanguageBinding
import com.example.dz83month.repository.LanguageRepository


class LanguageFragment : Fragment(), OnItemClickListener {
    private var binding: FragmentLanguageBinding? = null
    private val listCat = mutableListOf<CatModel>()
    private val repo = LanguageRepository()
    private val adapter = LanguageAdapter(listCat, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLanguageBinding.inflate(inflater, container, false)
        return binding?.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.rvLanguage?.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCat.addAll(repo.getListOfLanguageHTTP())
        binding?.rvLanguage?.adapter = adapter


        binding?.btnBack?.setOnClickListener {
            findNavController().navigate(R.id.action_languageFragment_to_edLanguageFragment)

        }
        getData()
    }

    private fun getData() {
        val bundle = arguments
        if (arguments != null) {
            val text = bundle?.getString("cat2")
            listCat.add(CatModel("", text.toString()))
        }
    }

        override fun onDestroy() {
            super.onDestroy()
            binding = null
        }

        override fun onClick(model: CatModel) {
            val bundle = Bundle()
            bundle.putSerializable("key", model)
            findNavController().navigate(
                R.id.action_languageFragment_to_detailLanguageFragment,
                bundle
            )
                .toString()
        }

    override fun onLongClick(textModel: CatModel): Boolean {
        TODO("Not yet implemented")
    }


}