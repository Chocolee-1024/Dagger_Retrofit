package com.example.daggerretorfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.daggerretorfit.App.MyApplication;
import com.example.daggerretorfit.Component.DaggerMainComponent;
import com.example.daggerretorfit.Response.AlbumsRespones;
import com.example.daggerretorfit.Service.ApiClient;
import com.example.daggerretorfit.Service.ApiService;
import com.example.daggerretorfit.Response.PostsResponse;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private ApiService apiService;
    @Inject
    ApiClient apiClient;
    private TextView tv1;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().applicationComponent(MyApplication.getInstance().getapplication()).build().inject(this);
        apiService=apiClient.getApiService();
        init();
    }
    public void init(){
        tv1=(TextView)findViewById(R.id.tv1);
        button=(Button)findViewById(R.id.button);

    }
    public void ButtonClick(View view){
        Log.e("www","123");
    }
}