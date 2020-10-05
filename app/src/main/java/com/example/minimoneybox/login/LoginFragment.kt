package com.example.minimoneybox.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.minimoneybox.data.LoginRepositoryImpl
import com.example.minimoneybox.databinding.FragmentLoginBinding
import com.example.minimoneybox.retrofit.MoneyBoxService
import org.koin.android.viewmodel.ext.android.viewModel

class LoginFragment : Fragment() {

    lateinit var loginViewModel: LoginViewModel //by viewModel()
    private lateinit var binding: FragmentLoginBinding

//    val args: LoginFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        loginViewModel = LoginViewModel(LoginRepositoryImpl(MoneyBoxService.createService()))
        binding.viewModel = loginViewModel
        binding.lifecycleOwner = this
        binding.fragment = this

        return binding.root
    }
}