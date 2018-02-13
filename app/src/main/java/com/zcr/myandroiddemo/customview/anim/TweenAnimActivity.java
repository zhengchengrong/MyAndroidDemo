/*
 * Copyright (c) 18-2-13 上午9:31.
 * admin:郑程荣.
 * 文件名:TweenAnimActivity.java
 * 文件功能:补间动画展示
 */

package com.zcr.myandroiddemo.customview.anim;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.zcr.myandroiddemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by llz on 2018/2/13.
 */

public class TweenAnimActivity extends AppCompatActivity {

    @BindView(R.id.tv_scale)
    TextView mTvScale;
    @BindView(R.id.view_scale)
    View mViewScale;
    Animation scaleAnimation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tween_anim);
        ButterKnife.bind(this);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scaleanim);
        mTvScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewScale.setVisibility(View.VISIBLE);
                mViewScale.startAnimation(scaleAnimation);
            }
        });
    }
}
