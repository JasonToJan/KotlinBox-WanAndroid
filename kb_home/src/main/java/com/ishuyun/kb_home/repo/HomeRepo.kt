package com.ishuyun.kb_home.repo

import com.ishuyun.kb_common.base.BaseRepository
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_home.api.HomeApi
import com.ishuyun.kb_home.bean.Article
import com.ishuyun.kb_home.bean.Banner

/**
 * Created by ishuyun on 7/30/22.
 * mail: ishuyunforani@gmail.com
 */
class HomeRepo(private val api: HomeApi) : BaseRepository() {

    suspend fun getBanner(data: RespStateData<List<Banner>>) {
        dealResp(
            { api.getBanner() }, data
        )
    }

    suspend fun getArticle(currentPage: Int, data: RespStateData<Article>) = dealResp(
        { api.getArticleList(currentPage, 10) }, data
    )

    suspend fun collect(id: Int, data: RespStateData<String>) = dealResp(
        { api.collect(id) }, data
    )

    suspend fun unCollect(id: Int, data: RespStateData<String>) = dealResp(
        { api.unCollect(id) }, data
    )

}