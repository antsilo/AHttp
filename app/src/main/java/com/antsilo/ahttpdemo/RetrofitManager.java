package com.antsilo.ahttpdemo;


import com.antsilo.ahttp.RetrofitClient;

import retrofit2.Retrofit;

public class RetrofitManager {
    private static final String TAG = "RetrofitManager";
    private RetrofitClient retrofitClient = new RetrofitClient();
    private Retrofit retrofit;

    private RetrofitManager() {

    }

    public static RetrofitManager getInstance() {
        return RetrofitManagerHolder.instance;
    }

    private static class RetrofitManagerHolder {
        private static final RetrofitManager instance = new RetrofitManager();
    }


    public void init(String baseUrl) {
        retrofit = retrofitClient.initRetrofit(baseUrl);
    }

    public TestApi testApi(){
        String baseUrl = "http://gank.io/";
        retrofit = retrofitClient.initRetrofit(baseUrl);
        return retrofit.create(TestApi.class);
    }


}
