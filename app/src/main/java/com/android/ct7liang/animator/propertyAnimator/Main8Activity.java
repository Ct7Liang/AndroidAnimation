package com.android.ct7liang.animator.propertyAnimator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.android.ct7liang.animator.R;

public class Main8Activity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        imageView = findViewById(R.id.image_view);

        ObjectAnimator translationY = ObjectAnimator.ofFloat(imageView, "translationY", 0, 700);
        translationY.setDuration(5000);

        ObjectAnimator rotationY = ObjectAnimator.ofFloat(imageView, "rotationY", 0, 1080);
        rotationY.setDuration(5000);

        ObjectAnimator rotationX = ObjectAnimator.ofFloat(imageView, "rotationX", 0, 1080);
        rotationX.setDuration(5000);

        ObjectAnimator scaleX = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 2.5f, 1f);
        scaleX.setDuration(5000);

        ObjectAnimator scaleY = ObjectAnimator.ofFloat(imageView, "scaleY", 1f, 2.5f, 1f);
        scaleY.setDuration(5000);

        AnimatorSet animatorSet = new AnimatorSet();

//        animatorSet.playSequentially(translationY, rotationX, scaleX);
//        animatorSet.playTogether(translationY, rotationX, scaleX);



        animatorSet.start();
    }
}
