package com.example.qiwipay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.qiwi.MainActivityChoice

class MainActivitySeller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_seller)
    }

    fun clickChoice(view: View){
        val randomIntent = Intent(this, MainActivityChoice::class.java)
        startActivity(randomIntent)
    }
}