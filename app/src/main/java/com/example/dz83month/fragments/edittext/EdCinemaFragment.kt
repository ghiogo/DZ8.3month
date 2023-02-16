package com.example.dz83month.fragments.edittext

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dz83month.R
import com.example.dz83month.databinding.FragmentEdCatBinding
import com.example.dz83month.databinding.FragmentEdCinemaBinding

class EdCinemaFragment : Fragment() {

    private var binding: FragmentEdCinemaBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentEdCinemaBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClickListener()
    }

    private fun onClickListener() {
        binding?.btn?.setOnClickListener(View.OnClickListener {
            val bundle2 = Bundle()
            bundle2.putString("cat2", binding?.search?.text.toString())
            findNavController().navigate(R.id.action_edCinemaFragment_to_cinemaFragment, bundle2)
                .toString()
        })
    }
}