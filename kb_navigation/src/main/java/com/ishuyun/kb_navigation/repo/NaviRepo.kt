package com.ishuyun.kb_navigation.repo

import com.ishuyun.kb_common.base.BaseRepository
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_navigation.api.NaviApi
import com.ishuyun.kb_navigation.bean.Navi
import com.ishuyun.kb_navigation.bean.Sys


/**
 * Created by ishuyun on 8/7/22.
 * mail: ishuyunforani@gmail.com
 */
class NaviRepo(private val api: NaviApi) : BaseRepository() {
    suspend fun getSys(data: RespStateData<List<Sys>>) = dealResp({ api.getSys() }, data)
    suspend fun getNavi(data: RespStateData<List<Navi>>) = dealResp({ api.getNavi() }, data)
}