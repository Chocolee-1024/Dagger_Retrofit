package com.example.daggerretorfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.daggerretorfit.Component.DaggerApiComponent;
import com.example.daggerretorfit.Module.ApiModule;
import com.example.daggerretorfit.service.ApiClient;
import com.example.daggerretorfit.service.ApiService;
import com.example.daggerretorfit.service.Response;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {
    private ApiService apiService;
    @Inject
    ApiClient apiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyApplication.getInstance().getapplication().injuct(this);
        DaggerApiComponent.builder().apiModule(new ApiModule()).build().injuct(this);
        apiService=apiClient.getApiService();
        init();
    }
    public void init(){
        apiService.getResponse().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Log.e("www",response.body().getId());
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.e("www","errow"+t);
            }
        });
    }
}