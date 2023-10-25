package com.latihanbyrg.tugaspertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.latihanbyrg.tugaspertemuan9.databinding.FragmentHomeBinding


class homeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){

                buttonExploreDestination.setOnClickListener {
                    Snackbar.make(view,"Anda telah menekan tombol Explore Destination", Snackbar.LENGTH_SHORT).show()
                }
        }
    }


}