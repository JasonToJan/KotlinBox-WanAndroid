package com.ishuyun.kb_navigation.viewmodel


import com.ishuyun.kb_common.base.BaseViewModel
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_navigation.bean.Navi
import com.ishuyun.kb_navigation.bean.Sys
import com.ishuyun.kb_navigation.repo.NaviRepo

/**
 * Created by ishuyun on 8/7/22.
 * mail: ishuyunforani@gmail.com
 */
class NaviViewModel(private val repo: NaviRepo) : BaseViewModel() {

    var naviList = RespStateData<List<Navi>>()
    var sysList = RespStateData<List<Sys>>()

    fun getSys() = launch { repo.getSys(sysList) }
    fun getNavi() { launch { repo.getNavi(naviList) }}
}