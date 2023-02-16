package com.example.dz83month.fragments.edittext

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dz83month.R
import com.example.dz83month.databinding.FragmentEdCatBinding

class EdCatFragment : Fragment() {
    private var binding: FragmentEdCatBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentEdCatBinding.inflate(inflater, container, false)
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
                findNavController().navigate(R.id.action_edCatFragment_to_catFragment, bundle2)
                    .toString()
        })
    }

}

