package com.example.daggerretorfit.Service;

import com.example.daggerretorfit.Response.AlbumsRespones;
import com.example.daggerretorfit.Response.PostsResponse;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface ApiService {
    @GET("posts/1")
    Call<PostsResponse> getPostsResponse();

    @GET("albums/1")
    Call<AlbumsRespones> getAlbumsResponse();
}
