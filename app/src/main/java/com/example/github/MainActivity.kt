package com.example.github

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var sum=0
    val text:TextView=findViewById(R.id.textview);
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.menu){
            sum=0;
            text.text="${sum}"
        }
        return super.onOptionsItemSelected(item)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("NUMBER",sum)
    }
}
