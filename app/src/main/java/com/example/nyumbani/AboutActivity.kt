package com.example.nyumbani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    var ButtonDonate: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        ButtonDonate= findViewById(R.id.btn_now)

        ButtonDonate!!.setOnClickListener {
            val intent = Intent(this,CharityActivity::class.java)
            startActivity(intent)
        }


    }
}