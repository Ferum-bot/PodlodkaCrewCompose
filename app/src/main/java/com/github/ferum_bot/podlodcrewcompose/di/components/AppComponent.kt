package com.github.ferum_bot.podlodcrewcompose.di.components

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {

    fun inject(app: Application)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun add(appContext: Context): Builder

        fun build(): AppComponent
    }
}