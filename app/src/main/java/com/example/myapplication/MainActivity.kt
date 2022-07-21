package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val name = findViewById<EditText>(R.id.myname).text.toString()
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            println("Ваше имя:  $name")
        }*/
        val array: List<Int> = listOf(1,2,3,4,5)
        for(i in 1..5){
            for(j in 1..5){
                print("$i")
            }
            println()
        }
    }
}