package com.ishuyun.kb_home.viewmodel

import com.ishuyun.kb_common.base.BaseViewModel
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_home.bean.Article
import com.ishuyun.kb_home.bean.Banner
import com.ishuyun.kb_home.repo.HomeRepo

/**
 * Created by ishuyun on 7/30/22.
 * mail: ishuyunforani@gmail.com
 */
class HomeViewModel(private val repo: HomeRepo) : BaseViewModel() {

    var bannerList = RespStateData<List<Banner>>()
    var article = RespStateData<Article>()
    var collectData = RespStateData<String>()

    fun getBanner() = launch { repo.getBanner(bannerList) }
    fun getArticle(currentPage: Int) = launch { repo.getArticle(currentPage, article) }
    fun collect(id: Int) = launch { repo.collect(id, collectData) }
    fun unCollect(id: Int) = launch { repo.unCollect(id, collectData) }

}