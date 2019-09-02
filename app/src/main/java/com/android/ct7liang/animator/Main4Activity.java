package com.android.ct7liang.animator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

/**
 * scale动画
 */
public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView imageView = findViewById(R.id.image_view);

//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
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



        //以view左上角为中心点,做伸缩动画
        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2);

        //相对于view自身为坐标系,以view左上角为原点,直接设置伸缩动画的中心点位置坐标
//        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2, -100, 0);

        //相对于view自身,按照横向和纵向的百分比位置,设置伸缩动画的中心点位置坐标
//        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2, ScaleAnimation.RELATIVE_TO_SELF, 0.5f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f);

        //相对于view的父布局,按照横向和纵向的百分比为止,设置伸缩动画的中心点位置坐标
        //中心点横向坐标 = view距离父控件左边的距离+设置的横向百分比*父布局宽度
        //中心点纵向坐标 = view距离父控件上方的距离+设置的纵向百分比*父布局高度
//        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2, ScaleAnimation.RELATIVE_TO_PARENT, 0.5f, ScaleAnimation.RELATIVE_TO_PARENT, 0f);


        scaleAnimation.setRepeatMode(Animation.REVERSE);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setDuration(2500);
        scaleAnimation.setStartOffset(800);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setFillEnabled(true);
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setInterpolator(new LinearInterpolator());

        imageView.startAnimation(scaleAnimation);

    }
}
