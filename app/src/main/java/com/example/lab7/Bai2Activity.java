package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bai2Activity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        imageView = findViewById(R.id.imgAll);
    }

    public void All(View view) {
        ShowImage("All");
    }

    public void Doremon(View view) {
        ShowImage("Doremon");
    }

    public void Nobita(View view) {
        ShowImage("Nobita");
    }
    private void ShowImage(String img){
        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView,"translationX", 0f, 500f);
        anim.setDuration(2000);
        ObjectAnimator anim1 = ObjectAnimator.ofFloat(imageView,"alpha", 1f, 0f);
        anim1.setDuration(2000);
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(imageView,"translationX", -500f, 0f);
        anim2.setDuration(2000);
        ObjectAnimator anim3 = ObjectAnimator.ofFloat(imageView,"alpha", 1f, 0f);
        anim3.setDuration(2000);

        AnimatorSet ans = new AnimatorSet();
        ans.play(anim2).with(anim3).after(anim).after(anim1);
        ans.start();
        final String imgName = img;
        anim1.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if (imgName=="Nobita"){
                    imageView.setImageResource(R.drawable.nobita);
                }
                if (imgName=="Doremon"){
                    imageView.setImageResource(R.drawable.doraemon);
                }
                if (imgName=="All"){
                    imageView.setImageResource(R.drawable.all);
                }

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }
}