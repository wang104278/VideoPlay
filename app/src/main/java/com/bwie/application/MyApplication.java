package com.bwie.application;

import android.app.Activity;
import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/8.
 */
public class MyApplication extends Application {


    // 使用单例模式创建一个Activity管理对象，该对象中有一个Activity容器
    private static List<Object> activitys = new ArrayList<Object>();
    private static MyApplication instance;

    // 获取单例模式中唯一的MyApplication实例
    public static MyApplication getInstance() {
        if (instance == null)
            instance = new MyApplication();
        return instance;
    }

    public void addActivity(Activity activity) {
        if (!getActivitys().contains(activity))
            getActivitys().add(activity);
    }

    public void destory() {
        for (Object activity : activitys) {
            ((Activity) activity).finish();
        }

    }

    public static List<Object> getActivitys() {
        return activitys;
    }

    public static void setActivitys(List<Object> activitys) {
        MyApplication.activitys = activitys;
    }








}
