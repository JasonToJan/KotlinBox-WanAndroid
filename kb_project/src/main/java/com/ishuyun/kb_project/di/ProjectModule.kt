package com.ishuyun.kb_project.di

import com.ishuyun.kb_common.network.RetrofitManager
import com.ishuyun.kb_project.api.ProjectApi
import com.ishuyun.kb_project.repo.ProjectRepo
import com.ishuyun.kb_project.viewmodel.ProjectViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by ishuyun on 8/5/22.
 * mail: ishuyunforani@gmail.com
 */
val ProjectModule = module {
    single { RetrofitManager.getService(ProjectApi::class.java) }
    single { ProjectRepo(get()) }
    viewModel { ProjectViewModel(get()) }
}