 package com.example.github

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private  lateinit var myViewModel: MyViewModel
    lateinit var text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewModel=ViewModelProvider(this).get(MyViewModel::class.java)
        text=findViewById(R.id.textview)
        val button: Button=findViewById(R.id.button)
        val button2: Button=findViewById(R.id.button2)
        text.text="${myViewModel.number}"
        button.setOnClickListener{
            text.text= (myViewModel.number++).toString()
        }
        button2.setOnClickListener{
            text.text= (myViewModel.number--).toString()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.menu){
            myViewModel.number=0
            text.text="${myViewModel.number}"
        }
        return super.onOptionsItemSelected(item)
    }
}
