package com.android.retrofitdemo;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface ServiceInterface {
    @GET("/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Path("owner") String owner, @Path("repo") String repo);

    @GET("/repos/{owner}/{repo}/contributors")
    void contributors(@Path("owner") String owner, @Path("repo") String repo, Callback<List<Contributor>> callback);
}
