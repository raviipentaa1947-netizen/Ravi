package com.yourpackage;

import android.os.Bundle;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText basicSalaryInput = findViewById(R.id.basicSalaryInput);
        TextInputEditText allowanceInput = findViewById(R.id.allowanceInput);
        MaterialButton calculateButton = findViewById(R.id.calculateButton);
        TextView resultText = findViewById(R.id.resultText);

        calculateButton.setOnClickListener(v -> {
            String basicStr = basicSalaryInput.getText().toString();
            String allowanceStr = allowanceInput.getText().toString();

            double basic = basicStr.isEmpty() ? 0 : Double.parseDouble(basicStr);
            double allowance = allowanceStr.isEmpty() ? 0 : Double.parseDouble(allowanceStr);

            double total = basic + allowance;
            resultText.setText("Total Salary: ₹" + total);
        });
    }
}
