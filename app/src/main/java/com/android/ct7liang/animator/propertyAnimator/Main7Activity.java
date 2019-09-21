package com.android.ct7liang.animator.propertyAnimator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.ct7liang.animator.R;

public class Main7Activity extends AppCompatActivity {

    private View view;
    private ImageView imageView;
    private float x = -500;
    private float y = 500;
    private ObjectAnimator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        view = findViewById(R.id.view);
        imageView = findViewById(R.id.image_view);



//        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "alpha", 1f, 0.5f, 1f, 0f, 1f);
//        animator.setDuration(5000);
//        animator.setStartDelay(1000);
//        animator.setRepeatMode(ObjectAnimator.REVERSE);
//        animator.setRepeatCount(0);
//        animator.setInterpolator(new LinearInterpolator());
//        animator.start();


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                testTranslateX();

//                testTranslateY();

//                testScaleX();

//                testRotation();

                testRotationX();
            }
        });
    }


    private void testRotationX(){

        animator = ObjectAnimator.ofFloat(imageView, "rotationX", 0, 360, 405);
        animator.setDuration(3000);
        animator.setStartDelay(300);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.setRepeatCount(0);
        animator.setInterpolator(new LinearInterpolator());
        animator.start();

        AnimatorSet set = new AnimatorSet();
        set.playSequentially();
    }

    private void testRotation(){
        animator = ObjectAnimator.ofFloat(imageView, "rotation", 0, 250);
        animator.setDuration(3000);
        animator.setStartDelay(300);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.setRepeatCount(0);
        animator.setInterpolator(new LinearInterpolator());
        animator.start();
    }

    private void testScaleX(){
        animator = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 1.5f, 0.5f, 1f);
        animator.setDuration(3000);
        animator.setStartDelay(300);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.setRepeatCount(0);
        animator.setInterpolator(new LinearInterpolator());
        animator.start();
    }

    private void testTranslateX(){

        Toast.makeText(Main7Activity.this, "点击了ImageView", Toast.LENGTH_SHORT).show();
        x=x+100;

        animator = ObjectAnimator.ofFloat(imageView, "translationX", x, 100+x);
        animator.setDuration(3000);
        animator.setStartDelay(300);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.setRepeatCount(0);
        animator.setInterpolator(new LinearInterpolator());
        animator.start();
    }

    private void testTranslateY(){

        Toast.makeText(Main7Activity.this, "点击了ImageView", Toast.LENGTH_SHORT).show();
        y=y-100;

        animator = ObjectAnimator.ofFloat(imageView, "translationY", y, y-100);
        animator.setDuration(3000);
        animator.setStartDelay(300);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.setRepeatCount(0);
        animator.setInterpolator(new LinearInterpolator());
        animator.start();

        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {}

            @Override
            public void onAnimationEnd(Animator animation) {}

            @Override
            public void onAnimationCancel(Animator animation) {}

            @Override
            public void onAnimationRepeat(Animator animation) {}
        });

        /**
         *     很多时候我们并不想要监听那么多个事件，可能我只想要监听动画结
         * 束这一个事件，那么每次都要将四个接口全部实现一遍就显得非常繁琐。
         *     采用动画适配器（AnimatorListenerAdapter），解决实现接口繁
         * 琐的问题
         */
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                super.onAnimationCancel(animation);
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            animator.addPauseListener(new Animator.AnimatorPauseListener() {
                @Override
                public void onAnimationPause(Animator animation) {}

                @Override
                public void onAnimationResume(Animator animation) {}
            });
        }


        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {}
        });


    }
}
