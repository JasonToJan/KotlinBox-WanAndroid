package com.ishuyun.kb_user.di

import com.ishuyun.kb_common.network.RetrofitManager
import com.ishuyun.kb_user.api.UserApi
import com.ishuyun.kb_user.repo.LoginRepo
import com.ishuyun.kb_user.viewmodel.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by ishuyun on 8/21/22.
 * mail: ishuyunforani@gmail.com
 */
val userModule = module {
    single { RetrofitManager.getService(UserApi::class.java) }
    single { LoginRepo(get()) }
    viewModel { LoginViewModel(get()) }
}