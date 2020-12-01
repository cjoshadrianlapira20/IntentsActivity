package com.example.intentsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Uname = findViewById<EditText>(R.id.UName)
        val UPass = findViewById<EditText>(R.id.UPass)
        val LogInBtn = findViewById<Button>(R.id.LogInBtn)

        LogInBtn.setOnClickListener {
            var status = if (Uname.text.toString().equals("Josh")
                    && UPass.text.toString().equals("Culbengan")) "Logged in Succesfully" else "Log In Failed"

            Toast.makeText(this, status, Toast.LENGTH_LONG).show()

            findViewById<Button>(R.id.LogInBtn).setOnClickListener { ActivityMenu() }
            val intent = Intent(this, ActivityMenu::class.java)
            startActivity(intent)
        }
    }
}