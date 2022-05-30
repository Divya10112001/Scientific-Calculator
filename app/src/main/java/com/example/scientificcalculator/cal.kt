package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class cal : AppCompatActivity() {
    var t1: EditText? = null
    var t2: EditText? = null
    var t: TextView? = null
    var num1 = 0
    var num2 = 0
    val num: Boolean
        get() {
            t1 = findViewById<View>(R.id.num1) as EditText
            t2 = findViewById<View>(R.id.num2) as EditText
            t = findViewById<View>(R.id.result) as TextView
            val s1 = t1!!.text.toString()
            val s2 = t2!!.text.toString()
            if (s1 == null && s2 == null) {
                val result = "Enter a Value"
                t!!.text = result
                return false
            } else {
                num1 = s1.toInt()
                num2 = s2.toInt()
            }
            return true
        }

    fun addition(v: View?) {
        if (num) {
            val sum = (num1 + num2).toDouble()
            t!!.text = java.lang.Double.toString(sum)
        }
    }

    fun pow(v: View?) {
        if (num) {
            val power = Math.pow(num1.toDouble(), num2.toDouble())
            t!!.text = java.lang.Double.toString(power)
        }
    }

    fun subtraction(v: View?) {
        if (num) {
            val sub = (num1 - num2).toDouble()
            t!!.text = java.lang.Double.toString(sub)
        }
    }

    fun mod(v: View?) {
        if (num) {
            val mod = (num1 % num2).toDouble()
            t!!.text = java.lang.Double.toString(mod)
        }
    }

    fun multiplication(v: View?) {
        if (num) {
            val mul = (num1 * num2).toDouble()
            t!!.text = java.lang.Double.toString(mul)
        }
    }

    fun div(v: View?) {
        if (num) {
            val div = (num1 / num2).toDouble()
            t!!.text = java.lang.Double.toString(div)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal)
    }
}