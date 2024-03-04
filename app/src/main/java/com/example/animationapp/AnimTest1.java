package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimTest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_test1);

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimTesting();
            }
        });

       textView.setAlpha(0f);
       textView.animate()
               .alpha(1f)
               .setDuration(1000)
               .setStartDelay(4000)
               .start();

       button.setAlpha(0f);
       button.animate()
               .alpha(1f)
               .setDuration(1000)
               .setStartDelay(6500)
               .start();
    }

    private void AnimTesting() {
        Intent intent = new Intent(this, AnimTest2.class);
        startActivity(intent);
    }
}