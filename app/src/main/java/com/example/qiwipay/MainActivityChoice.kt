package com.example.qiwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.qiwipay.MainActivitySeller
import com.example.qiwipay.R

class MainActivityChoice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_choice)
    }
    fun toastSeller(view: View){
        val randomIntent = Intent(this, MainActivitySeller::class.java)
        startActivity(randomIntent)
    }
    fun toastBuyer(view: View){
        val randomIntent = Intent(this, MainActivityBuyer::class.java)
        startActivity(randomIntent)
    }

}