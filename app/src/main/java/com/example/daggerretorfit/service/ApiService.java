package com.example.daggerretorfit.service;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/posts/1")
    Call<Response> getResponse();
}