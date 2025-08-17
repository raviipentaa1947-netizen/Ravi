package com.example.salarycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 2000); // 2 seconds delay
    }
}
        logo.startAnimation(zoom);

        // Fade in "Created by Ravi"
        AlphaAnimation fade = new AlphaAnimation(0f, 1f);
        fade.setDuration(1200);
        fade.setFillAfter(true);
        created.startAnimation(fade);

        // Go to MainActivity
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, SPLASH_MS);
    }
}
