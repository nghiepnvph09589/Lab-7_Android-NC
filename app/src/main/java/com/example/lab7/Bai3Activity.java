package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.widget.ImageView;

public class Bai3Activity extends AppCompatActivity {
    ImageView imageView, imageView2, imageView3, imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        AnimatorSet animatorSet1 = (AnimatorSet) AnimatorInflater.loadAnimator(Bai3Activity.this, R.animator.animation);
        animatorSet1.setTarget(imageView2);
        animatorSet1.start();

        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(Bai3Activity.this, R.animator.animation2);
        animatorSet2.setTarget(imageView3);
        animatorSet2.start();

        AnimatorSet animatorSet3 = (AnimatorSet) AnimatorInflater.loadAnimator(Bai3Activity.this, R.animator.animation3);
        animatorSet3.setTarget(imageView4);
        animatorSet3.start();
    }
}