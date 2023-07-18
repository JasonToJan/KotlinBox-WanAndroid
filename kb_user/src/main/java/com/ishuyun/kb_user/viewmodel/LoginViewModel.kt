package com.ishuyun.kb_user.viewmodel

import com.ishuyun.kb_common.base.BaseViewModel
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_user.bean.LoginBean
import com.ishuyun.kb_user.repo.LoginRepo

/**
 * Created by ishuyun on 8/21/22.
 * mail: ishuyunforani@gmail.com
 */
class LoginViewModel(private val repo: LoginRepo) : BaseViewModel() {

    var loginData = RespStateData<LoginBean>()

    fun login(username: String, password: String) {
        launch(
            block = {
                repo.login(username, password,loginData)
            }
        )
    }
}