package com.example.kotlinbasic.Calculadora

class CalculadoraPresenter(activity: CalculadoraActivity) : CalculadoraContract.Presenter{
    private var activity: CalculadoraActivity = activity

    override fun calculateOperation(operator: String, value1: Int, value2: Int) {
        if (operator.equals("+")){

        }
    }

    override fun calculateAdd(number1: String, number2: String) {

    }

    override fun calculateSustract(number1: String, number2: String) {

    }

    override fun homologateQuantity(number1: String, number2: String) {
        /*var diff = Math.abs(number1.length - number2.length)
        if (number1.length < number2.length) {
            var prefix: String = ""
            while (diff > 0) {
                prefix = "${prefix}0"
                diff--
            }
            number1 = "${prefix}${number1}"
        }
        else {
            var prefix: String = ""
            while (diff > 0) {
                prefix = "${prefix}0"
                diff--
            }
            number2 = "${prefix}${number2}"
        }*/
    }

}
