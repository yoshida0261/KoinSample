package jp.co.stah.koinsample

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()

        // Koinコンテナ生成
        startKoin{
            modules(listOf(
                repositoryModule,
                viewModelModule
            ))
        }
    }


    private val repositoryModule: Module = module {
        factory {
            GreetingRepository() as GreetingRepositoryContract

        }
    }

    private val viewModelModule: Module = module {
        factory { MainViewModel(get()) as MainViewModelContract }
    }
}