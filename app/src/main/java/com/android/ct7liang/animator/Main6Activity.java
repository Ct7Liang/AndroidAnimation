package com.android.ct7liang.animator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/**
 * 补间动画集合
 */
public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ImageView imageView = findViewById(R.id.image_view);

//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_set);
//
//        imageView.startAnimation(animation);


        ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 2f, 1f, 2f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(3500);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(Animation.REVERSE);

        RotateAnimation rotateAnimation = new RotateAnimation(0, 1440, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(3500);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(Animation.REVERSE);

        AnimationSet animationSet = new AnimationSet(false);

        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);

        imageView.startAnimation(animationSet);
    }
}
