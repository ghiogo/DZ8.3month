package com.example.dz83month.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dz83month.CatModel
import com.example.dz83month.OnItemClickListener
import com.example.dz83month.R
import com.example.dz83month.cat_adapter.CatAdapter
import com.example.dz83month.cat_adapter.CinemaAdapter
import com.example.dz83month.databinding.FragmentCatBinding
import com.example.dz83month.databinding.FragmentCinemaBinding
import com.example.dz83month.repository.CatRepository
import com.example.dz83month.repository.CinemaRepository


class CinemaFragment : Fragment(), OnItemClickListener {
    private var binding: FragmentCinemaBinding?= null
    private val listCat = mutableListOf<CatModel>()
    private val repo =CinemaRepository()
    private val adapter = CinemaAdapter(listCat, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCinemaBinding.inflate(inflater, container, false)
        return binding?.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.rvCinema?.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
        listCat.addAll(repo.getListOfCinemaHTTP())
        binding?.rvCinema?.adapter= adapter


        binding?.btnBack?.setOnClickListener{
            findNavController().navigate(R.id.action_cinemaFragment_to_edCinemaFragment)
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

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun onClick(model: CatModel) {
        val bundle = Bundle()
        bundle.putSerializable("key", model)
        findNavController().navigate(R.id.action_cinemaFragment_to_detailCinemaFragment, bundle)
            .toString()
    }

    override fun onLongClick(textModel: CatModel): Boolean {
        TODO("Not yet implemented")
    }

}


