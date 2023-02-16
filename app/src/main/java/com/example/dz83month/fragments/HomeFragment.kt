package com.example.dz83month.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dz83month.R
import com.example.dz83month.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnCats?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_catFragment)

        }
        binding?.btnCinema?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_cinemaFragment)
        }
        binding?.btnLanguage?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_languageFragment)
        }
    }
}
