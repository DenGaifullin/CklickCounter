package com.example.incodecourse1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.IntegerRes
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView : TextView? = null
    private var buttonInc : Button? = null
    private var count = 0
    private val key = "COUNT"
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null){
            count = savedInstanceState.getInt(key)
        }

        textView = findViewById(R.id.textView)
        buttonInc = findViewById(R.id.buttonIncr)
        textView?.setText(count.toString())
    }
    fun click(view : View) {
        count++
        textView?.setText(count.toString())
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt(key, count)
    }
}
