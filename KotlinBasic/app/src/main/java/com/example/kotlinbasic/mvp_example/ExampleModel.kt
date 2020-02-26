package com.example.kotlinbasic.mvp_example

class ExampleModel: Contract.Model {
    private var counter = 0

    override fun getCounter() = counter

    override fun incrementCounter() {
        counter++
    }
}