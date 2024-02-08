package com.example.testez06

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val qa: Button = findViewById(R.id.qa)
        val cal: Button = findViewById(R.id.cal)
        val login: Button = findViewById(R.id.login)

        cal.setOnClickListener(View.OnClickListener {
            // สร้าง Intent เพื่อเปิดแอปพลิเคชันใน package "ez_calculator"
            val intent = Intent()
            intent.setClassName("com.example.eiei", "com.example.eiei.MainActivity")

            // เรียก startActivity เพื่อเปิดแอปพลิเคชัน
            startActivity(intent)
        })
        qa.setOnClickListener(View.OnClickListener {
            // สร้าง Intent เพื่อเปิดแอปพลิเคชันใน package "ez_calculator"
            val intent = Intent()
            intent.setClassName("com.example.eiei", "com.example.eiei.MainActivity")

            // เรียก startActivity เพื่อเปิดแอปพลิเคชัน
            startActivity(intent)
        })
        login.setOnClickListener(View.OnClickListener {
            // สร้าง Intent เพื่อเปิดแอปพลิเคชันใน package "ez_calculator"
            val intent = Intent()
            intent.setClassName("com.example.eiei", "com.example.eiei.MainActivity")

            // เรียก startActivity เพื่อเปิดแอปพลิเคชัน
            startActivity(intent)
        })
    }
}