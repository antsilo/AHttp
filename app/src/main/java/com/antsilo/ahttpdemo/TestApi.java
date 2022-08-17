package com.antsilo.ahttpdemo;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author antsilo
 * @email chezi008@qq.com
 * @date 2022/8/17 9:11
 * @description:
 */
public interface TestApi {

    @GET("api/data/{type}/{count}/{page}")
    Observable<HttpResp> getData(@Path("type")String type , @Path("count")Integer count, @Path("page")Integer page);


}
