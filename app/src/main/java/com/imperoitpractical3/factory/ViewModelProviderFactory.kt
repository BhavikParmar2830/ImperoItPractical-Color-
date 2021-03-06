package com.imperoitpractical3.factory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.imperoitpractical3.viewmodels.MainActivityViewModel

class ViewModelProviderFactory(private val application: Application) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {

            modelClass.isAssignableFrom(MainActivityViewModel::class.java) -> MainActivityViewModel(application = application) as T

            else -> throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}