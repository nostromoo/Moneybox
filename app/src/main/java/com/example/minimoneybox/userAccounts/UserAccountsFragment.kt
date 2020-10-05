package com.example.minimoneybox.userAccounts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.navArgs
import com.example.minimoneybox.databinding.FragmentUserAccountsBinding

class UserAccountsFragment : Fragment() {

    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var userAccountsViewModel: UserAccountsViewModel
    private lateinit var binding: FragmentUserAccountsBinding

//    val args: UserAccountsFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentUserAccountsBinding.inflate(inflater, container, false)

        userAccountsViewModel = UserAccountsViewModel()
        binding.lifecycleOwner = this

        userAccountsViewModel.userAccounts.observe(viewLifecycleOwner){ userAccounts ->
            binding.userAccountsRecyclerView.adapter = UserAccountsAdapter().also {
                it.submitList(userAccounts)
            }
        }

        userAccountsViewModel.planValue.observe(viewLifecycleOwner){

        }



//        movieDetailViewModel.userAccounts.postValue(listOf(
//            UserAccountViewModel(UserAccount("Stocks and Shares ISA", "1000", "700")),
//            UserAccountViewModel(UserAccount("General Investment Account", "2000", "20")),
//            UserAccountViewModel(UserAccount("Lifetime ISA", "4000", "100"))
//        ))

        return binding.root
    }
}