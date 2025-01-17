package com.ishuyun.kb_common.util

/**
 * Created by ishuyun on 8/18/22.
 * mail: ishuyunforani@gmail.com
 */
class Constants {
    companion object {

        const val MIN_CLICK_DELAY_TIME: Int = 1000

        //arouter
        const val WEB_TITLE: String = "web_title"
        const val WEB_LINK: String = "web_link"
        const val PATH_WEB: String = "/kb_web/ui/WebActivity"
        const val PATH_LOGIN: String = "/kb_user/ui/LoginActivity"

        //kv
        const val USER_NAME: String = "user_name"
        const val USER_COOKIE: String = "user_cookie"

        //http
        const val HTTP_SUCCESS = 0
        const val HTTP_AUTH_INVALID = -1001

    }
}