package com.ishuyun.kb_project.viewmodel

import com.ishuyun.kb_common.base.BaseViewModel
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_project.bean.Project
import com.ishuyun.kb_project.bean.ProjectType
import com.ishuyun.kb_project.repo.ProjectRepo

/**
 * Created by ishuyun on 8/5/22.
 * mail: ishuyunforani@gmail.com
 */
class ProjectViewModel(private var repo: ProjectRepo) : BaseViewModel() {

    var proTypeList = RespStateData<List<ProjectType>>()
    var proList = RespStateData<Project>()
    var collectData = RespStateData<String>()

    fun getProTypeList() = launch(
        block = { repo.getProTypeList(proTypeList) }
    )

    fun getProList(currentPage: Int, cid: Int) = launch(
        block = { repo.getProList(currentPage, cid, proList) }
    )

    fun collect(id: Int) {
        launch(
            block = { repo.collect(id, collectData) }
        )
    }

    fun unCollect(id: Int) {
        launch(
            block = { repo.unCollect(id, collectData) }
        )
    }
}