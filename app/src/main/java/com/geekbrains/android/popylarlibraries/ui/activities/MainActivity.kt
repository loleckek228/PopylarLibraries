package com.geekbrains.android.popylarlibraries.ui.activities

import android.os.Bundle
import com.geekbrains.android.popylarlibraries.R
import com.geekbrains.android.popylarlibraries.mvp.presenter.MainPresenter
import com.geekbrains.android.popylarlibraries.mvp.view.MainView
import kotlinx.android.synthetic.main.activity_main.*
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        onClickButtonOne()
        onClickButtonTwo()
        onClickButtonThree()
    }

    private fun onClickButtonOne() {
        buttonCounterOne.setOnClickListener {
            presenter.buttonOneClick()
        }
    }

    private fun onClickButtonTwo() {
        buttonCounterTwo.setOnClickListener {
            presenter.buttonTwoClick()
        }
    }

    private fun onClickButtonThree() {
        buttonCounterThree.setOnClickListener {
            presenter.buttonThreeClick()
        }
    }

    override fun setTextButtonOne(value: Int) {
        buttonCounterOne.text = String.format(getString(R.string.count), value)
    }

    override fun setTextButtonTwo(value: Int) {
        buttonCounterTwo.text = String.format(getString(R.string.count), value)
    }

    override fun setTextButtonThree(value: Int) {
        buttonCounterThree.text = String.format(getString(R.string.count), value)
    }
}