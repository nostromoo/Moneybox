package com.example.minimoneybox.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.example.minimoneybox.data.LoginRepository
import com.example.minimoneybox.retrofit.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel(private val loginRepository: LoginRepository) : ViewModel() {


    fun signIn(fragment: LoginFragment) {
        viewModelScope.launch {
//            isLoading.postValue(true)
            withContext(Dispatchers.IO) {
                runCatching {
                    val response = loginRepository.postSession(User("jaeren+androidtest@moneyboxapp.com", "P455word12"))
                    response.body()?.let {
                        val action = LoginFragmentDirections.actionLoginFragmentToUserAccountsFragment()
                        findNavController(fragment).navigate(action)
                    }
                }.exceptionOrNull()?.let {
//                    hasError.postValue(true)
//                    error.postValue(it.message ?: "")
                }
            }
//            isLoading.postValue(false)
        }
    }
}
