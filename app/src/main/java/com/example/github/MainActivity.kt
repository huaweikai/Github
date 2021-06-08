package com.example.github

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var sum=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button=findViewById(R.id.button);
        val button2: Button=findViewById(R.id.button2);
        val text:TextView=findViewById(R.id.textview);
        sum=savedInstanceState?.getInt("NUMBER")?:0
        text.text= sum.toString()
        button.setOnClickListener{
            text.text= (sum++).toString()
        }
        button2.setOnClickListener{
            text.text= (sum--).toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("NUMBER",sum)
    }
}