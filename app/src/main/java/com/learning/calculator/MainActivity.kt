package com.learning.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var tvInput: TextView? = null
    var lastNumeric : Boolean = false
    var hasDecimal : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
    }

    fun onDigit(view: View) {
        tvInput?.append((view as Button).text)
        lastNumeric = true;
        hasDecimal = false;
    }

    fun onClear(view: View) {
        tvInput?.text = ""
    }

    fun onDecimal(view: View) {
        if(lastNumeric && !hasDecimal) {
            tvInput?.append(".")
            lastNumeric = false;
            hasDecimal = true;
        }
    }
}