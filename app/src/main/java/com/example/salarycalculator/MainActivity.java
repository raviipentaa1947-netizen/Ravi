package com.example.salarycalculator;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView createdBy = findViewById(R.id.createdByText);

        // Delay then fade in
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            AlphaAnimation fadeIn = new AlphaAnimation(0f, 1f);
            fadeIn.setDuration(1500);
            fadeIn.setFillAfter(true);
            createdBy.setVisibility(View.VISIBLE);
            createdBy.startAnimation(fadeIn);
        }, 1000); // 1s delay after opening
    }
}
