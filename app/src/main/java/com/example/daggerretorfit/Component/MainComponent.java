package com.example.daggerretorfit.Component;

import com.example.daggerretorfit.MainActivity;
import com.example.daggerretorfit.Scoped.MainAnntation;
import com.example.daggerretorfit.Module.MainModule;
import dagger.Component;

//使用Shope讓不同分頁拿東西只能再設定的Shope範圍拿
@MainAnntation
@Component(modules = MainModule.class,dependencies = ApplicationComponent.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
