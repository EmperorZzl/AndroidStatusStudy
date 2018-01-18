package com.devstrongzhao.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//        绿色，已经加入控制暂未提交
//        红色，未加入版本控制
//        蓝色，加入，已提交，有改动
//        白色，加入，已提交，无改动
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
