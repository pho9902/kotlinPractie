package com.example.andoridcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun onClickPlus(view : View) {
        val first : EditText = findViewById(R.id.firstNum)
        val second : EditText = findViewById(R.id.secondNum)

        val answer = Integer.parseInt(first.text.toString()) + Integer.parseInt(second.text.toString())

        val result : TextView = findViewById(R.id.result)
        result.setText(answer.toString())
    }

    fun onClickSub(view : View) {
        val first : EditText = findViewById(R.id.firstNum)
        val second : EditText = findViewById(R.id.secondNum)

        val answer = Integer.parseInt(first.text.toString()) - Integer.parseInt(second.text.toString())

        val result : TextView = findViewById(R.id.result)

        if (Integer.parseInt(first.text.toString()) < Integer.parseInt(second.text.toString())) {
            result.setText("-" + answer.toString())
        }
        else {
            result.setText(answer.toString())
        }

    }

    fun onClickMulti(view : View) {
        val first : EditText = findViewById(R.id.firstNum)
        val second : EditText = findViewById(R.id.secondNum)

        val answer = Integer.parseInt(first.text.toString()) * Integer.parseInt(second.text.toString())

        val result : TextView = findViewById(R.id.result)
        result.setText(answer.toString())
    }

    fun onClickDiv(view : View) {
        val first : EditText = findViewById(R.id.firstNum)
        val second : EditText = findViewById(R.id.secondNum)

        val answer = Integer.parseInt(first.text.toString()) / Integer.parseInt(second.text.toString())

        val result : TextView = findViewById(R.id.result)
        result.setText(answer.toString())
    }

}