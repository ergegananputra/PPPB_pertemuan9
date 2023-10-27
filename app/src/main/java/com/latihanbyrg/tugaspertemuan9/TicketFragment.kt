package com.latihanbyrg.tugaspertemuan9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.latihanbyrg.tugaspertemuan9.databinding.FragmentTicketBinding


class TicketFragment : Fragment() {

    private lateinit var binding: FragmentTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {

            buttonBuyTicket.setOnClickListener {
                val action = TicketFragmentDirections.actionTicketFragmentToBuyTicketFragment()


                findNavController().navigate(action)

            }

            findNavController().currentBackStackEntry?.
            savedStateHandle?.let {
                it.getLiveData<String>("ticket").observe(viewLifecycleOwner) { result ->
                    lastBuyTicket.text = "recently buy ticket $result"
                }
            }



        }
    }


}