package com.ishuyun.synthdata

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.ishuyun.kb_common.util.AppLogUtil
import com.ishuyun.kb_common.util.ToastUtil
import com.ishuyun.kb_home.di.homeModule
import com.ishuyun.kb_me.di.meModule
import com.ishuyun.kb_navigation.di.naviModule
import com.ishuyun.kb_project.di.ProjectModule
import com.ishuyun.kb_user.di.userModule
import com.tencent.mmkv.MMKV
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by ishuyun on 7/27/22.
 * mail: ishuyunforani@gmail.com
 */
class MyApp : Application() {

    private val modules = mutableListOf(homeModule, ProjectModule, naviModule, meModule, userModule)

    override fun onCreate() {
        super.onCreate()
        ToastUtil.init(this)
        initKoin()
        initARouter()
        initMMKV()
        AppLogUtil.init(this)
    }

    private fun initMMKV() {
        MMKV.initialize(this)
    }

    private fun initARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }

    private fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            modules(modules)
        }
    }
}