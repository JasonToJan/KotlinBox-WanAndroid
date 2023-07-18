package com.ishuyun.kb_home.di

import com.ishuyun.kb_common.network.RetrofitManager
import com.ishuyun.kb_home.api.HomeApi
import com.ishuyun.kb_home.repo.HomeRepo
import com.ishuyun.kb_home.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by ishuyun on 8/1/22.
 * mail: ishuyunforani@gmail.com
 */
val homeModule = module {
    single { RetrofitManager.getService(HomeApi::class.java) }
    single { HomeRepo(get()) }
    viewModel { HomeViewModel(get()) }
}