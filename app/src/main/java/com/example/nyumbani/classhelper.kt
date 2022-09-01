package com.example.nyumbani

class classhelper {

    lateinit var fname:String
    lateinit var lname:String
    lateinit var address:String
    lateinit var card:String
    lateinit var amount:String
    lateinit var cardno:String
    lateinit var secno:String
    lateinit var exno:String
    lateinit var exmonth:String

    constructor(
        fname: String,
        lname: String,
        address: String,
        card: String,
        amount: String,
        cardno: String,
        secno: String,
        exno: String,
        exmonth: String
    ) {
        this.fname = fname
        this.lname = lname
        this.address = address
        this.card = card
        this.amount = amount
        this.cardno = cardno
        this.secno = secno
        this.exno = exno
        this.exmonth = exmonth
    }
}