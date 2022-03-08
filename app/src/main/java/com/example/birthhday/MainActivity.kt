package com.example.birthhday

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.lang.UCharacter.getAge
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.util.*





    class MainActivity : AppCompatActivity() {
        lateinit var etId: EditText
        lateinit var etName: TextView
        lateinit var etRoll: EditText
        lateinit var btnSend: Button
        var globalage = 0
        var sendmonth = 6

        @RequiresApi(Build.VERSION_CODES.N)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            val selectDate = findViewById<TextView>(R.id.dob)




           selectDate.setOnClickListener(){
                val c = Calendar.getInstance()
                c.add(Calendar.YEAR,-18)
                val year = c.get(Calendar.YEAR)
                val month = c.get(Calendar.MONTH)
                val day = c.get(Calendar.DAY_OF_MONTH)

                val datepopup = DatePickerDialog(this,  DatePickerDialog.OnDateSetListener { view, year, monthofyear, dayofmonth->

                    val months = monthofyear+1
                    sendmonth = months;
                    selectDate.setText("$dayofmonth/$months/$year")
            },year,month,day)
                datepopup.show()
                Calculateage(year,month,day)

           }


            etId = findViewById(R.id.name)
            etName = findViewById(R.id.dob)

            btnSend = findViewById(R.id.btnSend)


            btnSend.setOnClickListener {

                val bundle = Bundle()
                bundle.putString("Name", etId.text.toString())
                bundle.putString("dob", etName.text.toString())
                bundle.putString("age", globalage.toString())
                bundle.putInt("month", sendmonth)



                val intent = Intent(this, Activity2::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }






        }

        private fun Calculateage(year: Int, month: Int, day: Int) {

            val year = year.toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val intCurrentYear = currentYear.toInt();
            val age = intCurrentYear - year
            age.toString()
            globalage  = age
        }


    }



