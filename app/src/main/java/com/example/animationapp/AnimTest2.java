package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AnimTest2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_test2);

        ImageView imageView = findViewById(R.id.imageView2);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.complex_animation);
        imageView.startAnimation(animation);
    }
}