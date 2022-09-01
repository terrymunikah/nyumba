package com.example.nyumbani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.nyumbani.databinding.ActivityCharityBinding
import com.example.nyumbani.databinding.ActivityReportBinding
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class CharityActivity : AppCompatActivity(), View.OnClickListener {

    private var fname: TextInputLayout? = null
    private var lname: TextInputLayout? = null
    private var address: TextInputLayout? = null
    private var card: TextInputLayout? = null
    private var amount: TextInputLayout? = null
    private var cardno: TextInputLayout? = null
    private var secno : TextInputLayout? = null
    private var exno : TextInputLayout? = null
    private var exmonth : TextInputLayout? = null

    private lateinit var donatebtn : Button

    lateinit var rootNode :FirebaseDatabase
    lateinit var reference: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charity)

        fname = findViewById(R.id.fname)
        lname = findViewById(R.id.lname)
        address = findViewById(R.id.address)
        card = findViewById(R.id.card)
        amount = findViewById(R.id.amount)
        cardno = findViewById(R.id.cardno)
        secno = findViewById(R.id.secno)
        exno = findViewById(R.id.exno)
        exmonth = findViewById(R.id.exmonth)


        donatebtn = findViewById(R.id.donatebtn)

        donatebtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v){
            donatebtn -> {
                rootNode = FirebaseDatabase.getInstance()
                reference = rootNode.getReference("user")

               var fname = fname?.editText!!.text.toString()
               var lname= lname?.editText!!.text.toString()
               var address = address?.editText!!.text.toString()
               var card = card?.editText!!.text.toString()
               var amount= amount?.editText!!.text.toString()
               var cardno= cardno?.editText!!.text.toString()
               var secno= secno?.editText!!.text.toString()
               var exno= exno?.editText!!.text.toString()
               var exmonth= exmonth?.editText!!.text.toString()

               val helperclass: classhelper = classhelper(fname,lname,address,card,amount,cardno,secno,exno,exmonth)
               reference.child(address).setValue(helperclass)

            }
        }

    }
}