package com.example.kotlinbasic.Calculadora

interface CalculadoraContract {
    interface Activity{
        fun showResult(result:String)
    }

    interface Presenter {
        fun calculateOperation(operator: String, value1: Int, value2: Int)
        fun calculateAdd(number1: String, number2: String)
        fun calculateSustract(number1: String, number2: String)
        fun homologateQuantity(number1: String, number2: String)
    }
}