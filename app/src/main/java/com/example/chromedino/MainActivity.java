package com.example.chromedino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int Splash_Screen=3000;

     Animation topanim,bottomanim;
     ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);



        logo=findViewById(R.id.logo);


        logo.setAnimation(topanim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,Dashboard.class);
                startActivity(intent);
                finish();
            }
        },Splash_Screen);
    }
}