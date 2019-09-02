package com.android.ct7liang.animator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * 补间动画 - 透明度动画
 */

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ImageView imageView = findViewById(R.id.image_view);

//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(Main2Activity.this, "123", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
//
//
//
//        animation.setRepeatCount(-1);
//
//        animation.setRepeatMode(Animation.REVERSE);
//
//        animation.setDuration(3000);
//
//        animation.setStartOffset(1500);
//
//        imageView.startAnimation(animation);


        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);


        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(Animation.RESTART);
        alphaAnimation.setDuration(3000);
        alphaAnimation.setStartOffset(2000);


        imageView.startAnimation(alphaAnimation);


    }
}
