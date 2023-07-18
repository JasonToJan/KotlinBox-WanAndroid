package com.ishuyun.kb_me.api

import com.ishuyun.kb_common.network.BaseResp
import com.ishuyun.kb_me.bean.MyCollect
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by ishuyun on 8/25/22.
 * mail: ishuyunforani@gmail.com
 */
interface MeApi {
    //首页文章列表
    @GET("lg/collect/list/{page}/json")
    suspend fun getCollectList(
        @Path("page") page: Int,
        @Query("page_size") page_size: Int
    ): BaseResp<MyCollect>
}