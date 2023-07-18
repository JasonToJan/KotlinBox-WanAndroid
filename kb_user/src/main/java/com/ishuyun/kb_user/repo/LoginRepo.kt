package com.ishuyun.kb_user.repo

import com.ishuyun.kb_common.base.BaseRepository
import com.ishuyun.kb_common.network.RespStateData
import com.ishuyun.kb_user.api.UserApi
import com.ishuyun.kb_user.bean.LoginBean

/**
 * Created by ishuyun on 8/21/22.
 * mail: ishuyunforani@gmail.com
 */
class LoginRepo(private val api: UserApi) : BaseRepository() {
    suspend fun login(username: String, password: String, data: RespStateData<LoginBean>) =
        dealResp(
            block = { api.login(username, password) }, data
        )

}