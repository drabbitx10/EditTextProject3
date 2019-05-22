package com.example.iteradmin.edittextproject3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<Button>(R.id.button)
        val forget = findViewById<Button>(R.id.button1)

        login.setOnClickListener(this);
        forget.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id) {
            R.id.button -> {
                Toast.makeText(applicationContext, "button", Toast.LENGTH_LONG).show()
            }
            R.id.button1 ->{
                Toast.makeText(applicationContext, "button1", Toast.LENGTH_LONG).show()
            }
        }
    }

}
