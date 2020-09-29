package com.geekbrains.android.popylarlibraries.mvp.presenter

import com.geekbrains.android.popylarlibraries.mvp.model.Model
import com.geekbrains.android.popylarlibraries.mvp.view.MainView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    private val model = Model()

    fun buttonOneClick() {
        val value = model.calcValue(0)
        viewState.setTextButtonOne(value)
    }

    fun buttonTwoClick() {
        val value = model.calcValue(1)
        viewState.setTextButtonTwo(value)
    }

    fun buttonThreeClick() {
        val value = model.calcValue(2)
        viewState.setTextButtonThree(value)
    }
}