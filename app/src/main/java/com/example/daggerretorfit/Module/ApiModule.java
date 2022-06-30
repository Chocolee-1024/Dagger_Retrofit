package com.example.daggerretorfit.Module;

import com.example.daggerretorfit.service.ApiClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule {
    @Singleton
    @Provides
    ApiClient providesClient(){
        return new ApiClient();
    }

}
