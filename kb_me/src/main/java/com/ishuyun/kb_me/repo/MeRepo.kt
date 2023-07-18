package com.ishuyun.kb_me.repo

import com.ishuyun.kb_common.base.BaseRepository
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_me.api.MeApi
import com.ishuyun.kb_me.bean.MyCollect

/**
 * Created by ishuyun on 8/25/22.
 * mail: ishuyunforani@gmail.com
 */
class MeRepo(private val api: MeApi) : BaseRepository() {

    suspend fun getCollectList(currentPage: Int, data: RespStateData<MyCollect>) =
        dealResp({ api.getCollectList(currentPage, 10) }, data)

}