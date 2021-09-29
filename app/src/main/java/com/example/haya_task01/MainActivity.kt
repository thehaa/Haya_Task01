package com.example.haya_task01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameText: EditText = findViewById(R.id.editTextTextPersonName)
        val mobileText: EditText = findViewById(R.id.editTextTextPersonName2)
        val clickBtn : Button = findViewById(R.id.button)

        clickBtn.setOnClickListener {
            Toast.makeText(this,"Name ${nameText.text}, Mobile ${mobileText.text}",Toast.LENGTH_SHORT).show()
        }
    }
}