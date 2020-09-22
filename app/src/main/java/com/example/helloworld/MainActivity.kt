package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        // val btnClickMe = findViewById<Button>(R.id.button)
        // var myTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        // set on-click listener
        button.setOnClickListener {
            timesClicked += 1
            textView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hi Shane", Toast.LENGTH_SHORT).show()
        }
    }
}