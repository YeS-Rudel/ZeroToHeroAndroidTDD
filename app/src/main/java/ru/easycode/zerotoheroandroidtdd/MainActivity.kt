package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val linearLayout = LinearLayout(this)
        val textView = TextView(this)
        textView.id = R.id.titleTextView
        textView.text = "I am an Android Developer!"
        linearLayout.addView(textView)
        val button = Button(this)
        button.id = R.id.button
        linearLayout.addView(button)
        setContentView(linearLayout)
    }
}