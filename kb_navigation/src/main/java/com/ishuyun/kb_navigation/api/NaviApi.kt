package com.ishuyun.kb_navigation.api
import com.ishuyun.kb_common.network.BaseResp
import com.ishuyun.kb_navigation.bean.Navi
import com.ishuyun.kb_navigation.bean.Sys
import retrofit2.http.GET

/**
 * Created by ishuyun on 8/7/22.
 * mail: ishuyunforani@gmail.com
 */
interface NaviApi {

    //获取导航
    @GET("/navi/json")
    suspend fun getNavi(): BaseResp<List<Navi>>

    //获取体系
    @GET("/tree/json")
    suspend fun getSys(): BaseResp<List<Sys>>
}