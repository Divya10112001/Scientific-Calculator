package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

class tri : AppCompatActivity() {

        var txt: EditText? = null
        var r: TextView? = null
        var n = 0
    val num: Boolean
        get() {
            var cos = findViewById<Button>(R.id.cos)
            var sin = findViewById<Button>(R.id.sin)
            var tan = findViewById<Button>(R.id.tan)
            var cosec = findViewById<Button>(R.id.cosec)
            var cot = findViewById<Button>(R.id.cot)
            var sec = findViewById<Button>(R.id.sec)
            txt = findViewById<View>(R.id.number) as EditText
            r = findViewById<View>(R.id.result12) as TextView
            val s1 = txt!!.text.toString()
            if (s1 == null ) {
                val result = "Enter a Value"
                r!!.text = result
                return false
            } else {
                n = s1.toInt()

            }
            return true

        }

    fun sin(v: View){
        if (num)
             r!!.text=(sin(n.toDouble())).toString()
         }


        fun cos(v: View) {
            if (num)
                r!!.text=(cos(n.toDouble())).toString()

        }

        fun tan(v: View) {
            if (num)
                r!!.text=(tan(n.toDouble())).toString()
        }

        fun cosec(v: View) {
            if (num)
                r!!.text=(1/(sin(n.toDouble()))).toString()

        }

        fun sec(v: View) {
            if (num)
                r!!.text=(1/(cos(n.toDouble()))).toString()
        }

        fun cot(v: View) {
            if (num)
                r!!.text=(1/(tan(n.toDouble()))).toString()

        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tri)
    }
}