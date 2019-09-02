package com.android.ct7liang.animator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * translate动画
 */
public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ImageView imageView = findViewById(R.id.image_view);

//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(Main5Activity.this, "translate", Toast.LENGTH_SHORT).show();
//            }
//        });

//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
//
//        //以下设置均可在xml文件中配置
//        animation.setRepeatMode(Animation.REVERSE);
//        animation.setRepeatCount(-1);
//        animation.setDuration(2500);
//        animation.setStartOffset(800);
//        animation.setFillAfter(true);
//        animation.setFillEnabled(true);
//        animation.setFillBefore(true);
//        animation.setInterpolator(new LinearInterpolator());
//
//        imageView.startAnimation(animation);

        //设置view位移之前的和位移之后的X,Y方向的偏移量
//        TranslateAnimation translateAnimation = new TranslateAnimation(50, 600, 50, 1000);

        //相对于View自身, 以百分比的方式设置起始位置和偏移距离
//        TranslateAnimation translateAnimation = new TranslateAnimation(
//                TranslateAnimation.RELATIVE_TO_SELF, 0.1f,
//                TranslateAnimation.RELATIVE_TO_SELF, 0.9f,
//                TranslateAnimation.RELATIVE_TO_SELF, 0.1f,
//                TranslateAnimation.RELATIVE_TO_SELF, 0.9f
//        );

        //相对于View的父布局, 以百分比的方式设置起始位置和偏移距离
        //横向起始位置/偏移距离=view距离父布局左边的距离+横向百分比*父布局宽度
        //纵向起始位置/偏移距离=view距离父布局上边的距离+纵向百分比*父布局高度
        TranslateAnimation translateAnimation = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0.1f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.1f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f
        );

        translateAnimation.setRepeatMode(Animation.REVERSE);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setDuration(5000);
        translateAnimation.setStartOffset(1000);
        translateAnimation.setFillAfter(true);
        translateAnimation.setFillEnabled(true);
        translateAnimation.setFillBefore(true);
        translateAnimation.setInterpolator(new LinearInterpolator());

        imageView.startAnimation(translateAnimation);


    }
}
