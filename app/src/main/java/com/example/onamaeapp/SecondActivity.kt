package com.example.onamaeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName : TextView = findViewById(R.id.tvName)
        val btnBack : Button = findViewById(R.id.btnBack)

        // 受け取った値を表示
        val myName = intent.getStringExtra("MY_NAME")
        tvName.text = "${myName}さん"

        btnBack.setOnClickListener {
            finish()
        }
    }
}