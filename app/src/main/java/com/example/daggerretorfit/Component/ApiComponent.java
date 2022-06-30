package com.example.daggerretorfit.Component;

import com.example.daggerretorfit.MainActivity;
import com.example.daggerretorfit.Module.ApiModule;
import com.example.daggerretorfit.MyApplication;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApiModule.class)
public interface ApiComponent {
    void injuct(MyApplication myApplication);
    void injuct(MainActivity mainActivity);
}
