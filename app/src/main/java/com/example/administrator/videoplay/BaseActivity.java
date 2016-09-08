package com.example.administrator.videoplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.bwie.application.MyApplication;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getInstance().addActivity(this);

    }
    // 在需要退出的Activity中的onDestroy方法里调用destroy方法
    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyApplication.getInstance().destory();
    }
}
