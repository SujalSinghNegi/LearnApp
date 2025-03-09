package com.example.ff

import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ff.R.id.main

class NextScreen : AppCompatActivity() {
    private lateinit var nextScreenInfo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_next_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        nextScreenInfo= findViewById(R.id.nextScreenInfo)
        nextScreenInfo.text= Html.fromHtml(getString(R.string.NextScreenInfo), Html.FROM_HTML_MODE_LEGACY)
    }
}