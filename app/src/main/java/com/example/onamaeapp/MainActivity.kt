package com.example.onamaeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // viewを取得
        val et:EditText = findViewById(R.id.et)
        val btnStart:Button = findViewById(R.id.btnStart)

        // 画面遷移
        btnStart.setOnClickListener {

            if (et.text.toString() == ("")){
                // トースト
                 Toast.makeText(this,"何か書いて",Toast.LENGTH_LONG).show()

                // アラート
//                AlertDialog.Builder(this)
//                    .setTitle("ERROR!")
//                    .setMessage("何か書いて")
//                    .setPositiveButton("OK", null)
//                    .show()
            }else{
                val intent = Intent(this, SecondActivity::class.java)

                //　値を渡す
                intent.putExtra("MY_NAME", et.text.toString())
                startActivity(intent)
            }
        }
    }
}