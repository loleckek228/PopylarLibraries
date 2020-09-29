package com.geekbrains.android.popylarlibraries.mvp.view

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface MainView : MvpView {
    fun setTextButtonOne(value: Int)
    fun setTextButtonTwo(value: Int)
    fun setTextButtonThree(value: Int)
}