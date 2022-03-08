package com.example.birthhday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    lateinit var tvId: TextView
    lateinit var tvName: TextView
    lateinit var tvRoll: TextView
    lateinit var brithstone: TextView
    lateinit var zodia: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        tvId = findViewById(R.id.Name)
        tvName = findViewById(R.id.dob)
        tvRoll = findViewById(R.id.age)
        brithstone = findViewById(R.id.brithstone)
        zodia = findViewById(R.id.zodia)

        val bundle = intent.extras
        if (bundle != null) {
            tvId.text = "Name = ${bundle.getString("Name")}"
            tvName.text = "dob = ${bundle.getString("dob")}"
            tvRoll.text = "Age = ${bundle.getString("age")}"
            var month = bundle.getInt("month")


            if (month ==1){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "
            }else if(month ==2){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "

            }
            if (month ==3){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "


            }else if(month ==4){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "

            }
            if (month ==5){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "


            }else if(month ==6){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "

            }
            if (month ==7){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "


            }else if(month ==8){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "

            }

            if (month ==9){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "


            }else if(month ==10){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "

            }
            if (month ==11){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "


            }else if(month ==12){
                brithstone.text = "brithstone = "
                zodia.text = "zodia sign = "

            }

        }
    }

}