package com.example.kotlinbasic.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R
import kotlinx.android.synthetic.main.activity_main.*

data class Person(val name:String, val dni:String)

class MainActivity : AppCompatActivity() {
    var varValue: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("Elvis", "12234567")

        btnCalculate.setOnClickListener { v ->
            tv_result.text = sum(Integer.parseInt(txt_number1.text.toString()),Integer.parseInt(txt_number2.text.toString())).toString() +
                    "\n" +
                    "" + example(txt_number1.text.toString(), txt_number2.text.toString())
        }
        varValue = 1
        varValue = 3

        val str = "${person.name}"
    }

    fun sum(a:Int, b:Int) = a + b

    fun example(x: String, y: String) = "$x concatenado con $y"
}
