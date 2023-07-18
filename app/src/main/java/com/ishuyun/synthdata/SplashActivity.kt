package com.ishuyun.synthdata

import android.content.Intent
import android.os.Bundle
import com.ishuyun.kb_common.base.BaseActivity
import com.ishuyun.synthdata.databinding.ActivitySplashBinding

/**
 * Created by ishuyun on 4/21/22.
 * mail: ishuyunforani@gmail.com
 */
class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutID(): Int {
        return R.layout.activity_splash
    }

    override fun init() {
//        val oldTime = System.currentTimeMillis()
//        Log.d("TAG", oldTime.toString())
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}