package com.example.qiwi


import android.content.Intent
import android.net.Uri

import android.os.Bundle

import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.qiwipay.R

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.io.DataOutputStream
import java.io.InputStreamReader
import java.net.*


var phone : String = ""
var tokenBuyer : String = ""

fun post2(phone: String, token: String): String {
    val url = URL("http://192.168.0.102/auth/")
    val postData = "{\"phone\": \"$phone\", \"token\": \"$token\"}"
//    val postData = mapOf<String,String>(
//        "'phone'" to phone,
//        "'token'" to token,
//    )
    val conn = url.openConnection() as HttpURLConnection
    conn.requestMethod = "POST"
    conn.doOutput = true
    conn.setRequestProperty("Content-Type", "application/json")
    conn.setRequestProperty("Content-Length", postData.toString().length.toString())
    conn.useCaches = false

    DataOutputStream(conn.outputStream).use { it.writeBytes(postData.toString()) }
    BufferedReader(InputStreamReader(conn.inputStream)).use { br ->
        var line: String
        while (br.readLine().also { line = it } != null) {
            return line
        }
    }
    return ""
}


class MainActivity : AppCompatActivity() {

    var res: String = "N"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickNew(view: View) {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://qiwi.com/api"))
        startActivity(i)

    }

    fun clickNomer(view: View){
        val nomer = "Номер без кода страны (9876542323)"
        val duration = Toast.LENGTH_LONG
        Toast.makeText(applicationContext, nomer, duration).show()
    }



    fun toastMe(view: View){
        //val editTextPhone: EditText = findViewById(R.id.editTextPhone)

        //phone = editTextPhone.text.toString()

//        val editTextToken: EditText = findViewById(R.id.editTextTextMultiLine)
//        val token: String = editTextToken.text.toString()
//
//        val text = "Loading..."
//        val duration = Toast.LENGTH_LONG


//        val job = GlobalScope.launch {
//            res = post2(phone,token).toString()
//        }
//        Toast.makeText(applicationContext, text, duration).show()
//        while (job.isActive){
//
//        }
//        if ("true" in res){
//            Toast.makeText(applicationContext, "Ошибка", Toast.LENGTH_SHORT).show()
//        }
//        else{
        val randomIntent = Intent(this, MainActivityChoice::class.java)
        startActivity(randomIntent)//}
        println(res)
//        res = res.substring(10, res.length)
//        var i = 0
//        while(res[i] != '"')
//        {
//            tokenBuyer += res[i]
//            i++
//        }
//
//
//
//        println(tokenBuyer)
    }




}