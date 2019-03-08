package com.example.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.adapter = MediaAdapter(getMedia())
    }

    fun toast(message: String) {
        Toast.makeText(this, "Mensaje: $message", Toast.LENGTH_LONG).show()
    }
}
