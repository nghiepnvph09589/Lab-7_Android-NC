package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Bai1Activity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        imageView = findViewById(R.id.anh);
    }

    public void rotation(View view) {
        int dest = 360;
        if (imageView.getRotation()==360){
            System.out.print(imageView.getAlpha());
            dest=0;
        }
        ObjectAnimator animation1 = ObjectAnimator.ofFloat(imageView, "rotation", dest);
        animation1. setDuration(2000);
        animation1.start();
    }

    public void zoom(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        imageView.startAnimation(animation);
    }

    public void moving(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,
                R.anim.animation);
        imageView.startAnimation(animation);
    }
}