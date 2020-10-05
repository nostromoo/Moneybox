package com.example.minimoneybox

import android.app.Application
import com.example.minimoneybox.data.LoginRepository
import com.example.minimoneybox.data.LoginRepositoryImpl
import com.example.minimoneybox.login.LoginViewModel
import com.example.minimoneybox.retrofit.MoneyBoxService
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MoneyBoxApplication : Application() {

    private val appModule = module {
//         Network
        single { MoneyBoxService.createService() }
        single<LoginRepository> { LoginRepositoryImpl(get()) }

//         ViewModel
        viewModel { LoginViewModel(get()) }
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MoneyBoxApplication)
            modules(appModule)
        }
    }
}
