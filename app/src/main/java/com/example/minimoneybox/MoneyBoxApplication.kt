package com.example.minimoneybox

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MoneyBoxApplication : Application() {

    private val appModule = module {
        // Network and Cache
//        single { AlbumsService.createService() }
//        single<Cache> { FileSystemCache(get()) }
//        single<AlbumsRepository> { AlbumsRepositoryAdapter(get(), get()) }

        // UseCase
//        single { FetchAlbumsUseCase.create(get()) }
//        single { FetchTracksForAlbumUseCase.create(get()) }

        // ViewModel
//        viewModel { AlbumListViewModel(get()) }
//        viewModel { (albumId : String) -> TrackListViewModel(get(), albumId) }
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
