package com.devstrongzhao.study.statusBar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import devstrongzhao.studyandroiddev.R;

public class StatusBarMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_bar_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatusBarMainActivity.this.startActivity(
                        new Intent(StatusBarMainActivity.this, FitsSystemWindowsActivity.class));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatusBarMainActivity.this.startActivity(
                        new Intent(StatusBarMainActivity.this, StatusBarViewActivity.class));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatusBarMainActivity.this.startActivity(
                        new Intent(StatusBarMainActivity.this, ImmersionImageActivity.class));
            }
        });
    }

}
