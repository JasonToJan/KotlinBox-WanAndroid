package com.ishuyun.kb_me.di

import com.ishuyun.kb_common.network.RetrofitManager
import com.ishuyun.kb_me.api.MeApi
import com.ishuyun.kb_me.repo.MeRepo
import com.ishuyun.kb_me.viewmodel.MeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by ishuyun on 8/25/22.
 * mail: ishuyunforani@gmail.com
 */
val meModule = module {
    single { RetrofitManager.getService(MeApi::class.java) }
    single { MeRepo(get()) }
    viewModel { MeViewModel(get()) }
}