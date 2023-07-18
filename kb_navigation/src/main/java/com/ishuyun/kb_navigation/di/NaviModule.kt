package com.ishuyun.kb_navigation.di

import com.ishuyun.kb_common.network.RetrofitManager
import com.ishuyun.kb_navigation.api.NaviApi
import com.ishuyun.kb_navigation.repo.NaviRepo
import com.ishuyun.kb_navigation.viewmodel.NaviViewModel
import org.koin.androidx.viewmodel.dsl.viewModel

import org.koin.dsl.module

/**
 * Created by ishuyun on 8/7/22.
 * mail: ishuyunforani@gmail.com
 */
val naviModule = module {
    single { RetrofitManager.getService(NaviApi::class.java) }
    single { NaviRepo(get()) }
    viewModel { NaviViewModel(get()) }
}