package com.ishuyun.kb_common.base

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.ishuyun.kb_common.util.LoadingViewUtil

/**
 * Created by ishuyun on 4/20/22.
 * mail: ishuyunforani@gmail.com
 */
abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {

    val TAG: String = this.javaClass.simpleName

    lateinit var mBind: T

    abstract fun getLayoutID(): Int

    abstract fun init()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        //StatusBarUtil.fitSystemBar(this)
        mBind = DataBindingUtil.setContentView(this, getLayoutID())
        init()

        //test
        //setGrayTheme()

    }

    private fun setGrayTheme() {
        val paint = Paint()
        val cm = ColorMatrix()
        cm.setSaturation(0F)
        paint.colorFilter = ColorMatrixColorFilter(cm)
        window.decorView.setLayerType(View.LAYER_TYPE_HARDWARE,paint)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
        mBind.unbind()
    }

    fun showLoadingDialog() {
        Log.d(TAG, TAG + "showLoadingDialog: ")
        LoadingViewUtil.showLoadingDialog(this, true)
    }

    fun dismissLoadingDialog() {
        Log.d(TAG, TAG + "dismissLoadingDialog: ")
        LoadingViewUtil.dismissLoadingDialog()
    }
}