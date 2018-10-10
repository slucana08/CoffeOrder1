package com.kotlin.coffeeorder.coffeorder

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun operation(view: View) {
        var a = 0.0
        var b = 0.0
        var result: Any = 0.0
        var button1 = view as Button

        if (number1_editText.text.toString() == "" || number2_editText.text.toString() == "")
            Toast.makeText(this, "Ingrese operando", Toast.LENGTH_SHORT).show()
        else {
            a = number1_editText.text.toString().toDouble()
            b = number2_editText.text.toString().toDouble()
            when (button1.text.toString()) {
                "+" -> result = a + b
                "-" -> result = a - b
                "*" -> result = a * b
                "/" -> if (b == 0.0) result = "Can't divide by 0" else result = a / b
            }
            result_textView.text = result.toString()
        }
    }
}


