/*
 * Copyright (c) 18-2-13 上午9:42.
 * admin:郑程荣.
 * 文件名:MainActivity.java
 * 文件功能:
 */

package com.zcr.myandroiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.zcr.myandroiddemo.customview.anim.TweenAnimActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_01)
    TextView mTv01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mTv01.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_01:
                Intent intent = new Intent(this, TweenAnimActivity.class);
                startActivity(intent);
                break;
        }
    }
}
