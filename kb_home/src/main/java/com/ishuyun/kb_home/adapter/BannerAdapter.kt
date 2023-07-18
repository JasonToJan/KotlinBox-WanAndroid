package com.ishuyun.kb_home.adapter

import android.widget.ImageView
import coil.load
import com.ishuyun.kb_home.R
import com.ishuyun.kb_home.bean.Banner
import com.zhpan.bannerview.BaseBannerAdapter
import com.zhpan.bannerview.BaseViewHolder

/**
 * Created by ishuyun on 8/3/22.
 * mail: ishuyunforani@gmail.com
 */
class BannerAdapter : BaseBannerAdapter<Banner>() {

    override fun bindData(
        holder: BaseViewHolder<Banner>?,
        data: Banner?,
        position: Int,
        pageSize: Int
    ) {
        holder?.findViewById<ImageView>(R.id.image_banner)?.load(data?.imagePath)
    }

    override fun getLayoutId(viewType: Int): Int {
        return R.layout.item_banner
    }

}