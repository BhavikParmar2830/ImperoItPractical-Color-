package com.imperoitpractical3.viewmodels

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.lifecycle.MutableLiveData

import com.imperoitpractical3.base.BaseViewModel


class MainActivityViewModel(application: Application) : BaseViewModel(application) {

    private val TAG = "MainActivityViewModel"

    var row6Text : MutableLiveData<String> = MutableLiveData("0")
    var row5Text : MutableLiveData<String> = MutableLiveData("0")
    var row4Text : MutableLiveData<String> = MutableLiveData("0")
    var row3Text : MutableLiveData<String> = MutableLiveData("0")
    var row2Text : MutableLiveData<String> = MutableLiveData("0")
    var row1Text : MutableLiveData<String> = MutableLiveData("0")

    var row6Drawable : MutableLiveData<Drawable> = MutableLiveData()
    var row5Drawable : MutableLiveData<Drawable> = MutableLiveData()
    var row4Drawable : MutableLiveData<Drawable> = MutableLiveData()
    var row3Drawable : MutableLiveData<Drawable> = MutableLiveData()
    var row2Drawable : MutableLiveData<Drawable> = MutableLiveData()
    var row1Drawable : MutableLiveData<Drawable> = MutableLiveData()

}