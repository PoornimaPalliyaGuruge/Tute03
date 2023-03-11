package com.example.tute03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.tute03.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edtNumber1: EditText
    lateinit var edtNumber2: EditText
    lateinit var edtAnswer: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edt_num01)
        edtNumber2 = findViewById(R.id.edt_num02)


        val intent = Intent(this, activity_display::class.java)
        intent.putExtra("answer", edt_answer)
        startActivity(intent)
        finish()

    }

    fun buttonClick(v: View) {


        var ans = 0.0
        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble())
        when (v.id) {
            R.id.btn_Plus -> ans = calculator.add()
            R.id.btn_Minus -> ans = calculator.subtract()
            R.id.btn_Multiply -> ans = calculator.multiply()
            R.id.btn_Divide -> ans = calculator.divide()
        }
        println(ans)//this will print the output on the terminal



    }
}
