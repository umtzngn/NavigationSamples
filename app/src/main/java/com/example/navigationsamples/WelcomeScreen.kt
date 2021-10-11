package com.example.navigationsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        var say_hello :TextView = findViewById(R.id.say_hello)
        var push_button:Button=findViewById(R.id.say_hello_button)
        var message = say_hello.text
        push_button.setOnClickListener {
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        }




    }
}