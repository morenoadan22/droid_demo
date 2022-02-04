package com.training.demo

import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    private lateinit var frameContainer : ViewGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        frameContainer = findViewById(R.id.container)
    }

    override fun onStart() {
        super.onStart()

        val helloWorldText = TextView(this).apply {
            text = getString(R.string.hello_text)
            setTextColor(Color.BLACK)
        }

        frameContainer.addView(helloWorldText, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}
