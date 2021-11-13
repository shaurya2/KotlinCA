package com.example.finalca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_two)

        val bttn1 = findViewById<RadioButton>(R.id.radioButton2)
        val bttn2 = findViewById<RadioButton>(R.id.radioButton3)
        val cbox = findViewById<CheckBox>(R.id.checkBox2)
        val bttn = findViewById<Button>(R.id.button2)

        bttn.setOnClickListener {
            Toast.makeText(this, "You have submitted", Toast.LENGTH_SHORT).show()
        }
        cbox.setOnClickListener {
            Toast.makeText(this, "You have agreed terms and condition", Toast.LENGTH_SHORT).show()
        }
        bttn2.setOnClickListener {
            Toast.makeText(this, "You choose mobile", Toast.LENGTH_SHORT).show()
        }
        bttn1.setOnClickListener{
            Toast.makeText(this, "You choose laptop", Toast.LENGTH_SHORT).show()
        }

    }
 ///tovdmvdf;l

    }

