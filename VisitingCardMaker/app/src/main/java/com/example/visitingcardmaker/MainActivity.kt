package com.example.visitingcardmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editname : EditText
    lateinit var editnum : EditText
    lateinit var editdate : EditText
    lateinit var editadd : EditText
    lateinit var setname : TextView
    lateinit var setdate : TextView
    lateinit var setnum: TextView
    lateinit var setadd : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editname = findViewById(R.id.editName)
        editnum = findViewById(R.id.editNum)
        editdate = findViewById(R.id.editDate)
        editadd = findViewById(R.id.editAdd)
        setname = findViewById(R.id.setName)
        setnum = findViewById(R.id.setNum)
        setdate = findViewById(R.id.setDate)
        setadd = findViewById(R.id.setAdd)
    }

    fun showName(view: View) {
        var name = editname.text
        var number = editnum.text.toString()
        var date = editdate.text
        var address = editadd.text

        setname.text = name
        setnum.text = number
        setdate.text = date
        setadd.text = address

    }

}