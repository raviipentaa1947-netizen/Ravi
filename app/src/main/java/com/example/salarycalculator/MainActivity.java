package com.example.salarycalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val basicSalaryInput = findViewById<EditText>(R.id.etBasicSalary)
        val bonusInput = findViewById<EditText>(R.id.etBonus)
        val resultText = findViewById<TextView>(R.id.tvResult)
        val calculateBtn = findViewById<Button>(R.id.btnCalculate)

        calculateBtn.setOnClickListener {
            val basicSalary = basicSalaryInput.text.toString().toDoubleOrNull() ?: 0.0
            val bonus = bonusInput.text.toString().toDoubleOrNull() ?: 0.0
            val total = basicSalary + bonus
            resultText.text = "Total Salary: ₹$total"
        }
    }
}
