package com.example.minimoneybox.individualAccount

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.minimoneybox.databinding.FragmentIndividualAccountBinding

class IndividualAccountFragment : Fragment() {

    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var individualAccountViewModel: IndividualAccountViewModel
    private lateinit var binding: FragmentIndividualAccountBinding

//    val args: LoginFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentIndividualAccountBinding.inflate(inflater, container, false)

        individualAccountViewModel = IndividualAccountViewModel()
        binding.viewModel = individualAccountViewModel
        binding.lifecycleOwner = this

        return binding.root
    }
}