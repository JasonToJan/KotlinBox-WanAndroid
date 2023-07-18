package com.ishuyun.kb_common.network

/**
 * Created by ishuyun on 6/12/22.
 * mail: ishuyunforani@gmail.com
 */
class BaseResp<T> {
    var errorCode: Int = -1
    var errorMsg: String = ""
    var data: T? = null
    var responseState: ResponseState? = null
    enum class ResponseState {
        REQUEST_START,
        REQUEST_SUCCESS,
        REQUEST_FAILED,
        REQUEST_ERROR
    }
}