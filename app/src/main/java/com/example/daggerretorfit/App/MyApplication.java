package com.example.daggerretorfit.App;

import android.app.Application;

import com.example.daggerretorfit.Component.ApplicationComponent;

import com.example.daggerretorfit.Component.DaggerApplicationComponent;
import com.example.daggerretorfit.Module.ApiModule;

public class MyApplication extends Application {
    private static MyApplication instance;
    private static ApplicationComponent apiComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        instance=this;

        apiComponent= DaggerApplicationComponent.builder().apiModule(new ApiModule()).build();
        apiComponent.injuct(this);
    }
    public static MyApplication getInstance(){
        if(instance==null)
            instance=new MyApplication();
        return instance;
    }
    public ApplicationComponent getapplication(){
        return apiComponent;
    }
}
