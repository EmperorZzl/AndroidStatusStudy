package com.devstrongzhao.study.statusBar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.devstrongzhao.study.R;
import com.devstrongzhao.study.utils.StatusBarUtils;


public class StatusBarViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_bar_view);
        StatusBarUtils.with(this)
                .setColor(getResources().getColor(R.color.colorPrimaryDark))
//                .setDrawable(getResources().getDrawable(R.drawable.shape))
                .init();


//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

    }



}
