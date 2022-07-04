package com.example.daggerretorfit.Component;

import com.example.daggerretorfit.Module.ApiModule;
import com.example.daggerretorfit.App.MyApplication;
import com.example.daggerretorfit.Service.ApiClient;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApiModule.class)
public interface ApplicationComponent {
    void injuct(MyApplication myApplication);

    ApiClient providesClient();
//    void injuct(MainActivity mainActivity);
}
