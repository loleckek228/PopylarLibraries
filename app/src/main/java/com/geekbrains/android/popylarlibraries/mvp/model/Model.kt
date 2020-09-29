package com.geekbrains.android.popylarlibraries.mvp.model

class Model {
    private val counters = mutableListOf(0, 0, 0)

    private fun getValueByIndex(index: Int): Int = counters.get(index)

    private fun setValueByIndex(index: Int, value: Int) = counters.set(index, value)

    fun calcValue(index: Int): Int {
        val newValue = getValueByIndex(index) + 1
        setValueByIndex(index, newValue)

        return getValueByIndex(index)
    }
}