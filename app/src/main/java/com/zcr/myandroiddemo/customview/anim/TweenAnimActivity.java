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

public class TweenAnimActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_scale)
    TextView mTvScale;
    @BindView(R.id.view_scale)
    View mViewScale;
    Animation scaleAnimation;
    Animation alphaAnimation;
    Animation rotateAnimation;
    Animation translateAnimatioin;
    Animation allAnimatioin;

    @BindView(R.id.tv_alpha)
    TextView mTvAlpha;
    @BindView(R.id.tv_rotate)
    TextView mTvRotate;
    @BindView(R.id.tv_translate)
    TextView mTvTranslate;
    @BindView(R.id.tv_all)
    TextView mTvAll;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tween_anim);
        ButterKnife.bind(this);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scaleanim);
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alphaanim);
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotateanim);
        translateAnimatioin = AnimationUtils.loadAnimation(this, R.anim.translateanimanim);
        allAnimatioin = AnimationUtils.loadAnimation(this, R.anim.tweenall);
        mTvScale.setOnClickListener(this);
        mTvAlpha.setOnClickListener(this);
        mTvRotate.setOnClickListener(this);
        mTvTranslate.setOnClickListener(this);
        mTvAll.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_scale:
                mViewScale.setVisibility(View.VISIBLE);
                mViewScale.startAnimation(scaleAnimation);
                break;
            case R.id.tv_alpha:
                mViewScale.setVisibility(View.VISIBLE);
                mViewScale.startAnimation(alphaAnimation);
                break;
            case R.id.tv_rotate:
                mViewScale.setVisibility(View.VISIBLE);
                mViewScale.startAnimation(rotateAnimation);
                break;
            case R.id.tv_translate:
                mViewScale.setVisibility(View.VISIBLE);
                mViewScale.startAnimation(translateAnimatioin);
                break;
            case R.id.tv_all:
                mViewScale.setVisibility(View.VISIBLE);
                mViewScale.startAnimation(allAnimatioin);
                break;
        }
    }
}
