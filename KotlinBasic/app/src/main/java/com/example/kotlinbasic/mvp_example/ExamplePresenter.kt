package com.example.kotlinbasic.mvp_example

class ExamplePresenter(view: Contract.View): Contract.Presenter {
    private var view: Contract.View = view
    private var model: Contract.Model = ExampleModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}