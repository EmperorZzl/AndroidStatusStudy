package com.devstrongzhao.study.statusBar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.devstrongzhao.study.R;
import com.devstrongzhao.study.utils.StatusBarUtils;


public class ImmersionImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immersion_image);
        StatusBarUtils.with(this)
                .init();
    }
}
