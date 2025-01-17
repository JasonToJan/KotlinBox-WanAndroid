package com.ishuyun.kb_common.base

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding

/**
 * Created by ishuyun on 7/30/22.
 * mail: ishuyunforani@gmail.com
 */
abstract class BaseVMFragment<T : ViewDataBinding> : BaseFragment<T>() {
    protected var currentPage = 0
    protected var currentPageSize = 10
    private var isFirstLoad: Boolean = true

    abstract fun observe()
    abstract fun init()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe()
        init()
    }

    override fun onResume() {
        super.onResume()
        if (isFirstLoad) {
            isFirstLoad = false
            lazyLoad()
        }
    }

    open fun lazyLoad() {}

    open fun resetState() {}
}