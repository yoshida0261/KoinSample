package jp.co.stah.koinsample

import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()

        // Koinコンテナ生成
        startKoin(this, listOf(
            this.module
        ))
    }

    // Koinモジュール
    private val module: Module = module {
        factory { MainViewModel() }
    }
}