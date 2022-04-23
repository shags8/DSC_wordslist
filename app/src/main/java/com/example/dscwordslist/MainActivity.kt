package com.example.dscwordslist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    val v3 = arrayListOf<String>()
    fun getSet(view: View) {
        var i = 0
        val v1 = findViewById<EditText>(R.id.editText).text.toString() //to get input from the user
        val v2 = findViewById<TextView>(R.id.view)//finding the textview
        v2.text = ""//setting textview to no value
        v3.add(v1)//adding user inputs to array
        v2.append(v3.toString())//displaying  array elements in textview
        val v7 = findViewById<EditText>(R.id.editText).setText("")//setting edittext to  no value
    }

    fun removeWord(view: View) {
        var i = 0
        val v4 = findViewById<EditText>(R.id.editText).text.toString() //to get input from the user
        val case = findViewById<Switch>(R.id.case_sensitive)//switch for case sensitivity
        if (!v3.contains(v4)) {
            val toast = Toast.makeText(this, "WORD NOT FOUND!", Toast.LENGTH_SHORT).show()
        }
        if (case.isChecked) {
            while (i < v3.size) {
                if (v4 == v3[i]) { //to check if the user input is present or not
                    v3.remove(v4)
                    val v6 = findViewById<TextView>(R.id.view)
                    v6.text = ""//setting textview to no value
                    v6.append(v3.toString()) //displaying  array elements in textview
                }
                i++
            }
        } else {
            while (i < v3.size) {
                if (v4.equals(v3[i], true)) { //to check if the user input is present or not
                    v3.remove(v3[i])
                    val v6 = findViewById<TextView>(R.id.view)
                    v6.text = ""//setting textview to no value
                    v6.append(v3.toString()) //displaying  array elements in textview
                }
                i++
            }
        }
    }
}