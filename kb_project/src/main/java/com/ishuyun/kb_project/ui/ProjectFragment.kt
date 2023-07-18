package com.ishuyun.kb_project.ui

import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.ishuyun.kb_common.base.BaseVMFragment
import com.ishuyun.kb_common.network.BaseStateObserver
import com.ishuyun.kb_project.R
import com.ishuyun.kb_project.adapter.ProVPAdapter
import com.ishuyun.kb_project.bean.ProjectType
import com.ishuyun.kb_project.databinding.FragmentProjectBinding
import com.ishuyun.kb_project.viewmodel.ProjectViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by ishuyun on 7/27/22.
 * mail: ishuyunforani@gmail.com
 */
class ProjectFragment : BaseVMFragment<FragmentProjectBinding>() {

    private val projectViewModel: ProjectViewModel by viewModel()
    private var l: MutableList<String> = arrayListOf()
    private var f: MutableList<Fragment> = arrayListOf()

    override fun getLayoutID(): Int {
        return R.layout.fragment_project
    }

    override fun init() {
        projectViewModel.getProTypeList()
    }

    override fun observe() {
        projectViewModel.proTypeList.observe(this, object : BaseStateObserver<List<ProjectType>>(null) {
            override fun getRespDataSuccess(it: List<ProjectType>) {
                initTab(it)
            }
        })
    }

    private fun initTab(list: List<ProjectType>) {
        for (i in 0..4) {
            l.add((i + 1).toString() + "." + list[i].name)
            f.add(ProjectChildFragment.newInstance(list[i].id, i))
        }
        mBind.viewPager.adapter = ProVPAdapter(this, f)
        mBind.viewPager.offscreenPageLimit = 5
        TabLayoutMediator(mBind.tabLayout, mBind.viewPager) { tab, position ->
            tab.text = l[position]
        }.attach()
    }

}