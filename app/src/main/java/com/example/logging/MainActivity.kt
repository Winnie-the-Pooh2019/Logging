package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber
import timber.log.Timber.Forest.plant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plant(Timber.DebugTree())

        val textEdit = findViewById<EditText>(R.id.text_field)

        findViewById<Button>(R.id.logging_button_log).setOnClickListener {
            Log.v("From EditText", textEdit.text.toString())
        }

        findViewById<Button>(R.id.logging_button_timber).setOnClickListener {
            Timber.v(textEdit.text.toString())
        }
    }
}