package com.example.github

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button=findViewById(R.id.button);
        val button2: Button=findViewById(R.id.button2);
        val text:TextView=findViewById(R.id.textview);
        var sum:Int=0;
        text.text="0"
        button.setOnClickListener{
            text.text= (sum++).toString()
        }
        button2.setOnClickListener{
            text.text= (sum--).toString()
        }
    }
}