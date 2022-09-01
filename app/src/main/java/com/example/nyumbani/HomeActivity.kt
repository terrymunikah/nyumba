package com.example.nyumbani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    var ButtonDonate:Button ?= null
    var ButtonAbout:Button ?= null
    var Buttonreport:Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        ButtonDonate=findViewById(R.id.btn_donate)
        ButtonAbout=findViewById(R.id.btn_about)
        Buttonreport=findViewById(R.id.btn_report)

        ButtonDonate!!.setOnClickListener {
            val intent = Intent(this,CharityActivity::class.java)
            startActivity(intent)
        }

        ButtonAbout!!.setOnClickListener {
            val intent = Intent(this,AboutActivity::class.java)
            startActivity(intent)
        }

        Buttonreport!!.setOnClickListener {
            val intent = Intent(this,ReportActivity::class.java)
            startActivity(intent)
        }
    }
}