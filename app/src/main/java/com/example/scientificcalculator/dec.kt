package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class dec : AppCompatActivity() {
    fun convert(v: View?) {
        Toast.makeText(this, "Converting", Toast.LENGTH_SHORT).show()
        input = findViewById<View>(R.id.decimal) as EditText
        output1 = findViewById<View>(R.id.binary) as TextView
        output2 = findViewById<View>(R.id.hexa) as TextView
        output3 = findViewById<View>(R.id.octa) as TextView
        val s = input!!.text.toString()
        val i = s.toInt()
        val binary = Integer.toBinaryString(i) //To binary
        val hex = Integer.toHexString(i) //To hexadecimal
        val octa = Integer.toOctalString(i) //To octal
        output1!!.text = binary
        output2!!.text = hex
        output3!!.text = octa
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dec)
    }

    companion object {
        var input: EditText? = null
        var output1: TextView? = null
        var output2: TextView? = null
        var output3: TextView? = null
    }
}