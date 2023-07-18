package com.ishuyun.kb_home.api

import com.ishuyun.kb_common.network.BaseResp
import com.ishuyun.kb_home.bean.Article
import com.ishuyun.kb_home.bean.Banner
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by ishuyun on 7/30/22.
 * mail: ishuyunforani@gmail.com
 */
interface HomeApi {

    //首页banner
    @GET("banner/json")
    suspend fun getBanner(): BaseResp<List<Banner>>

    //首页文章列表
    @GET("article/list/{page}/json")
    suspend fun getArticleList(
        @Path("page") page: Int,
        @Query("page_size") page_size: Int
    ): BaseResp<Article>

    //收藏站内文章
    @POST("lg/collect/{id}/json")
    suspend fun collect(@Path("id") id: Int): BaseResp<String>

    //取消收藏（文章列表）
    @POST("lg/uncollect_originId/{id}/json")
    suspend fun unCollect(@Path("id") id: Int): BaseResp<String>

}