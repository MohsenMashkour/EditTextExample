package com.mkrdeveloper.edittextexample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<TextView>(R.id.txt1)
        val edt = findViewById<EditText>(R.id.edt)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val str = edt.text.toString()
            txt1.text = str

        }
    }
}