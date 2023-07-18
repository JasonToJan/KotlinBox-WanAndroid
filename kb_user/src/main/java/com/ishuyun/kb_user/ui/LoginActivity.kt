package com.ishuyun.kb_user.ui

import com.alibaba.android.arouter.facade.annotation.Route
import com.ishuyun.kb_common.base.BaseActivity
import com.ishuyun.kb_common.network.BaseStateObserver
import com.ishuyun.kb_common.util.Constants
import com.ishuyun.kb_common.util.KVUtil
import com.ishuyun.kb_common.util.ToastUtil
import com.ishuyun.kb_user.R
import com.ishuyun.kb_user.bean.LoginBean
import com.ishuyun.kb_user.databinding.ActivityLoginBinding
import com.ishuyun.kb_user.viewmodel.LoginViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by ishuyun on 8/21/22.
 * mail: ishuyunforani@gmail.com
 */
@Route(path = Constants.PATH_LOGIN)
class LoginActivity : BaseActivity<ActivityLoginBinding>() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun getLayoutID(): Int {
        return R.layout.activity_login
    }

    override fun init() {
        loginViewModel.loginData.observe(this, object :BaseStateObserver<LoginBean>(null){
            override fun getRespDataSuccess(it: LoginBean) {
                KVUtil.put(Constants.USER_NAME,it.username)
                ToastUtil.showMsg("登陆成功！")
                finish()
            }
        })

        mBind.txLogin.setOnClickListener {
            if (mBind.edit1.text.isNotEmpty() && mBind.edit2.text.isNotEmpty()) {
                loginViewModel.login(mBind.edit1.text.toString(), mBind.edit2.text.toString())
            } else {
                ToastUtil.showMsg("输入有误！")
            }
        }

        mBind.imgBack.setOnClickListener { finish() }

    }

}