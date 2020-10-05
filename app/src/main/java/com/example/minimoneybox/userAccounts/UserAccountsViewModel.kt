package com.example.minimoneybox.userAccounts

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserAccountsViewModel : ViewModel() {

    var title: String = ""

    val hello: MutableLiveData<String> =  MutableLiveData<String>("Hello Romain")

    val planValue: MutableLiveData<String> = MutableLiveData<String>("Total Plan Value : 7000$")

    val userAccounts : MutableLiveData<List<UserAccountViewModel>> by lazy {
        fetchUserAccounts()
        // We must explicit it because the compiler need it. Else it will raise the error below :
        // Type inference failed: Not enough information to infer parameter T in constructor MutableLiveData<T : Any!>(p0: T!)
        MutableLiveData<List<UserAccountViewModel>>()
    }

    private fun fetchUserAccounts() {
//        viewModelScope.launch {
//            userAccounts.value = (listOf(
//                UserAccountViewModel(UserAccount("Stocks and Shares ISA", "1000", "700")),
//                UserAccountViewModel(UserAccount("General Investment Account", "2000", "20")),
//                UserAccountViewModel(UserAccount("Lifetime ISA", "4000", "100"))
//            ))
//            isLoading.postValue(true)
//            withContext(Dispatchers.IO) {
//                runCatching {
//                    val albumList = useCase.invoke()
//                    albums.postValue(albumList.map { album ->
//                        AlbumViewModel(album)
//                    })
//                }.exceptionOrNull()?.let {
//                    hasError.postValue(true)
//                    error.postValue(it.message ?: "")
//                }
//            }
//            isLoading.postValue(false)
//        }
    }


}
