package com.example.qiwi

import android.annotation.SuppressLint
import android.content.Intent

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.qiwipay.R


class MainActivityBuyer : AppCompatActivity() {
    var im: ImageView? = null

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_buyer)

//        im = findViewById(R.id.QrImage)
//        CreateQr()

    }

    //    private fun CreateQr(){
////        try{
////            val barcodeEncode = BarcodeEncoder()
////            val bitmap: Bitmap = barcodeEncode.encodeBitmap("gogogo", BarcodeFormat.QR_CODE, 1000, 1000)
////            im?.setImageBitmap(bitmap)
////
////        }
////        catch (e: WriterException){
////
////        }
////    }
    fun clickChoice(view: View){
        val randomIntent = Intent(this, MainActivityChoice::class.java)
        startActivity(randomIntent)
    }

}
