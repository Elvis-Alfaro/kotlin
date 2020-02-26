package com.example.kotlinbasic.Calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinbasic.R
import kotlinx.android.synthetic.main.activity_calculadora.*

class CalculadoraActivity : AppCompatActivity(), CalculadoraContract.Activity{
    private var presenter: CalculadoraPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        
        presenter = CalculadoraPresenter(this)
    }

    override fun showResult(result: String) {
        lblScreen.text = result
    }
}
