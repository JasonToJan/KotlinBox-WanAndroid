package com.ishuyun.kb_me.viewmodel

import com.ishuyun.kb_common.base.BaseViewModel
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_me.bean.MyCollect
import com.ishuyun.kb_me.repo.MeRepo

/**
 * Created by ishuyun on 8/25/22.
 * mail: ishuyunforani@gmail.com
 */
class MeViewModel(private val repo: MeRepo) : BaseViewModel() {

    val collectList = RespStateData<MyCollect>()

    fun getCollectList(currentPage: Int) = launch { repo.getCollectList(currentPage, collectList) }
}