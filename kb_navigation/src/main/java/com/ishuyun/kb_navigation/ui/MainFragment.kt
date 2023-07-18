package com.ishuyun.kb_navigation.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.ishuyun.kb_common.base.BaseFragment
import com.ishuyun.kb_navigation.R
import com.ishuyun.kb_navigation.adapter.NaviVPAdapter
import com.ishuyun.kb_navigation.databinding.FragmentMainBinding
import com.ishuyun.kb_navigation.viewmodel.NaviViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by ishuyun on 8/8/22.
 * mail: ishuyunforani@gmail.com
 */
class MainFragment:BaseFragment<FragmentMainBinding>() {

    val naviViewModel: NaviViewModel by viewModel()
    private lateinit var l: MutableList<String>
    private lateinit var f: MutableList<Fragment>

    override fun getLayoutID(): Int {
        return R.layout.fragment_main
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        l = arrayListOf("导航","体系")
        f = arrayListOf(NaviFragment(),SysFragment())

        mBind.viewPager.adapter = NaviVPAdapter(this, f)
        TabLayoutMediator(mBind.tabLayout, mBind.viewPager) { tab, position ->
            tab.text = l[position]
        }.attach()
    }
}