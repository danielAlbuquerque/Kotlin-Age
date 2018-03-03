package com.albuquerque.findmyage1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnIdadeEvent(view:View) {
        val year:Int = editText.text.toString().toInt()
        val myAge = Calendar.getInstance().get(Calendar.YEAR) - year
        Toast.makeText(this@MainActivity, "Sua idade é $myAge", Toast.LENGTH_SHORT).show()
    }
}
