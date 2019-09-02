package com.android.ct7liang.animator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;


/**
 * 补间动画 -- 旋转动画
 */
public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        ImageView imageView = findViewById(R.id.image_view);
//
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
//
//        animation.setRepeatMode(Animation.RESTART); //设置重复模式(也可在xml中设置)
//        animation.setRepeatCount(0); //设置重复次数(也可在xml中设置)
//        animation.setDuration(6000); //设置动画执行时长(也可在xml中设置)
//        animation.setStartOffset(5000); //设置动画延迟执行时长(也可在xml中设置)
//        animation.setFillAfter(true); //设置动画结束之后View的位置(也可在xml中设置)
//        animation.setFillEnabled(true); //设置是否可以调整动画开始前View的位置(也可在xml中设置)
//        animation.setFillBefore(false); //设置动画结束之后的位置(也可在xml中设置)
//        animation.setInterpolator(new LinearInterpolator()); //设置动画进行的速率(也可在xml中设置)
//
//        imageView.startAnimation(animation);


//        android:pivotX="50%"
//        android:pivotY="-20%"
//        android:fromDegrees="90"
//        android:toDegrees="520"

//        android:repeatMode="restart"
//        android:repeatCount="0"
//        android:duration="6000"
//        android:startOffset="5000"
//        android:fillAfter="true"
//        android:fillEnabled="true"
//        android:fillBefore="false"
//        android:interpolator="@android:anim/linear_interpolator"

//        RotateAnimation rotateAnimation = new RotateAnimation();
//        rotateAnimation.setFillEnabled();

        ImageView imageView = findViewById(R.id.image_view);

//        //默认圆心为View的左上角
//        RotateAnimation rotateAnimation = new RotateAnimation(-30, 30); //默认圆心为View的左上角

        //以View的左上角为坐标中心, 直接设置圆心的横坐标pivotX和纵坐标为pivotY
//        RotateAnimation rotateAnimation = new RotateAnimation(0, 120, -20f, -20f);

//        //设置圆心的位置,相对于view自身的百分比位置
//        RotateAnimation rotateAnimation = new RotateAnimation(-30 ,30, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);

        //设置圆心的位置,相对于view父布局的百分比位置
        //圆心横坐标=view距离父布局左边的距离+百分比数值
        //圆心纵坐标=view距离父布局上方的距离+百分比数值
        RotateAnimation rotateAnimation = new RotateAnimation(-10, 10, RotateAnimation.RELATIVE_TO_PARENT, 0f, RotateAnimation.RELATIVE_TO_PARENT, 0f);

        rotateAnimation.setRepeatMode(Animation.REVERSE); //设置重复模式
        rotateAnimation.setRepeatCount(-1); //设置重复次数
        rotateAnimation.setDuration(2000); //设置动画执行时长
        rotateAnimation.setStartOffset(5000); //设置动画延迟执行时长
        rotateAnimation.setFillAfter(true); //设置动画结束之后View的位置
        rotateAnimation.setFillEnabled(true); //设置是否可以调整动画开始前View的位置
        rotateAnimation.setFillBefore(false); //设置动画结束之后的位置
        rotateAnimation.setInterpolator(new LinearInterpolator()); //设置动画进行的速率

        imageView.startAnimation(rotateAnimation);
    }
}
