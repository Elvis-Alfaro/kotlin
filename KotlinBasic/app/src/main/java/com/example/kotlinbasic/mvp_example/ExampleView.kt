package com.example.kotlinbasic.mvp_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinbasic.R

import kotlinx.android.synthetic.main.activity_example_view.*

class ExampleView : AppCompatActivity(), Contract.View {
    private var examplePresenter: ExamplePresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_view)

        examplePresenter = ExamplePresenter(this)
    }

    override fun initView() {
        txtMessage.text = examplePresenter?.getCounter()
        btnClick.setOnClickListener { examplePresenter?.incrementValue() }
    }

    override fun updateViewData() {
        txtMessage.text = examplePresenter?.getCounter()
    }

}
