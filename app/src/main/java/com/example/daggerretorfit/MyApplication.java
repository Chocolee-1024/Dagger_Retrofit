package com.example.daggerretorfit;

import android.app.Application;

import com.example.daggerretorfit.Component.ApiComponent;
import com.example.daggerretorfit.Component.DaggerApiComponent;
import com.example.daggerretorfit.Module.ApiModule;

public class MyApplication extends Application {
    private static MyApplication instance;
    private static ApiComponent apiComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        instance=this;

        apiComponent=DaggerApiComponent.builder().apiModule(new ApiModule()).build();
        apiComponent.injuct(this);
    }
    public static MyApplication getInstance(){
        if(instance==null)
            instance=new MyApplication();
        return instance;
    }
    public ApiComponent getapplication(){
        return apiComponent;
    }
}
