package com.example.scientificcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun trigonometry(v: View?) {
        Toast.makeText(this, "OPENING", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, tri::class.java)
        startActivity(intent)
    }fun calculate(v: View?) {
            Toast.makeText(this, "OPENING", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, cal::class.java)
            startActivity(intent)
    } fun conversion(v: View?) {
            Toast.makeText(this, "OPENING", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, dec::class.java)
            startActivity(intent)
            }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}