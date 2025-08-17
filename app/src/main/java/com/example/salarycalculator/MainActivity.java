package com.example.salarycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editSalary, editBonus;
    Button btnCalculate;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editSalary = findViewById(R.id.editSalary);
        editBonus = findViewById(R.id.editBonus);
        btnCalculate = findViewById(R.id.btnCalculate);
        textResult = findViewById(R.id.textResult);

        btnCalculate.setOnClickListener(v -> {
            String salaryStr = editSalary.getText().toString();
            String bonusStr = editBonus.getText().toString();

            if (!salaryStr.isEmpty() && !bonusStr.isEmpty()) {
                double salary = Double.parseDouble(salaryStr);
                double bonus = Double.parseDouble(bonusStr);
                double total = salary + bonus;

                textResult.setText("Total: ₹" + total);
            } else {
                textResult.setText("Please enter both values!");
            }
        });
    }
}
