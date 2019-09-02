package com.android.ct7liang.animator;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image_view);
//        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
//        animationDrawable.start(); //开始动画
//        animationDrawable.stop(); //停止动画



        final AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(true);
        for (int i = 0; i < 10; i++) {
//            int id = getResources().getIdentifier("bless_"+i+"_1", "drawable", "com.android.ct7liang.animator");
            int id = getResources().getIdentifier("b"+i, "drawable", "com.android.ct7liang.animator");
            Drawable drawable = getResources().getDrawable(id);
            animationDrawable.addFrame(drawable, 800);
        }
        imageView.setBackground(animationDrawable);
//        animationDrawable.start(); //开始动画
//        animationDrawable.stop(); //停止动画

        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.start();
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationDrawable.run();
            }
        });

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.stop();
            }
        });
    }
}
