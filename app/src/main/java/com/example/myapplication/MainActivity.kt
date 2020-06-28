package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnshowtoast.setOnClickListener {
            Log.i("MainActivity", "clicked")
            Toast.makeText(this, "button was clicked", Toast.LENGTH_SHORT).show()
        }
        btnSendMsgToNextActivity.setOnClickListener{

            val message:String = etUserMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }
}