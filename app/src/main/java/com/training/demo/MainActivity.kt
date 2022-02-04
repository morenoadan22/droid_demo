package com.training.demo

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    private lateinit var container : ViewGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        container = findViewById(R.id.container)

        val helloWorldText = TextView(this).apply {
            text = getString(R.string.hello_text)
            setTextColor(Color.BLACK)
        }

        val clickMeButton = Button(this).apply {
            text = getString(R.string.click_me)
            setTextColor(Color.BLACK)
            setBackgroundColor(Color.LTGRAY)
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_SHORT).show()
            }
        }

        container.addView(helloWorldText, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        container.addView(clickMeButton)
    }
}
