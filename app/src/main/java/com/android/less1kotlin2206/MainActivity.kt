package com.android.less1kotlin2206

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<AppCompatButton>(R.id.btn_action)
        btn.setOnClickListener{
            Toast.makeText(baseContext, "clicked", Toast.LENGTH_SHORT).show()
        }
    }
}