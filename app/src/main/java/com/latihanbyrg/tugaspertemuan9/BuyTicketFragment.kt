package com.latihanbyrg.tugaspertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.latihanbyrg.tugaspertemuan9.databinding.FragmentBuyTicketBinding

class BuyTicketFragment : Fragment() {
    private var _binding: FragmentBuyTicketBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding  = FragmentBuyTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {

            spinnerJenisTiket.adapter = context?.let {
                ArrayAdapter(
                    it,
                    android.R.layout.simple_spinner_dropdown_item,
                    resources.getStringArray(R.array.list_jenis_tiket)
                )
            }

            buttonBuyTicket.setOnClickListener {
                findNavController().apply {
                    previousBackStackEntry?.savedStateHandle?.set("ticket", spinnerJenisTiket.selectedItem.toString())
                }.navigateUp()

            }



        }
    }



}