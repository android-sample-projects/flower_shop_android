package com.example.robertpc.flowershoplast;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashActivity extends Activity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                Intent in = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(in);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }, SPLASH_TIME_OUT);
    }
}
